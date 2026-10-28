const params = new URLSearchParams(window.location.search);
const category = params.get("category");
const channel = params.get("channel");
// console.log(category);
// console.log(channel);

// i, j로 접근

const article_title = document.getElementById("article-header-title");
const article_header_desc = document.getElementById("article-header-desc");

const contents_node = document.getElementById("article-content");
const video_node = document.getElementById("article-video");

const channel_img_node = document.getElementById("channel-img");
const channel_text_node = document.getElementById("channel-text");

function getImgSrc(tag) {
  return `img/news-channel/${tag}.png`;
}

function getHref(i, j) {
  return `news.html?${category !== null ? "category" : "channel"}=${i}_${j}`;
}

function getRandomPairs(iMax, jMax, excludeI, excludeJ) {
  const result = [];
  const used = new Set();

  while (result.length < 5) {
    const i = Math.floor(Math.random() * iMax);
    const j = Math.floor(Math.random() * jMax);
    const key = `${i}_${j}`;

    if (category !== null && i == 0) {
      continue;
    }
    if ((i === excludeI && j === excludeJ) || used.has(key)) {
      continue;
    }

    used.add(key);
    result.push({ i, j });
  }

  console.log(result);
  return result;
}

let news_list_articles = [];
let nums = [];
if (category !== null) {
  let [i, j] = category.split("_");
  let data = category_news[i][j];

  document.querySelector("title").innerText = data[1];

  article_title.innerText = data[1];
  article_header_desc.innerText = `2026.10.13 · ${data[0].replaceAll(/[0-9]+/g, "")}`;
  contents_node.innerHTML = data[5] ?? "";

  channel_img_node.setAttribute("src", getImgSrc(data[3]));
  channel_text_node.innerText = data[3];

  video_node.setAttribute("src", `video/${data[0]}.mp4`);

  nums = getRandomPairs(3, 5, i, j);
  news_list_articles[0] = [category_news[nums[0].i][nums[0].j][1]];
  news_list_articles[1] = [category_news[nums[1].i][nums[1].j][1]];
  news_list_articles[2] = [category_news[nums[2].i][nums[2].j][1]];
  news_list_articles[3] = [
    category_news[nums[3].i][nums[3].j][1],
    category_news[nums[3].i][nums[3].j][2],
    category_news[nums[3].i][nums[3].j][0],
  ];
  news_list_articles[4] = [
    category_news[nums[4].i][nums[4].j][1],
    category_news[nums[4].i][nums[4].j][2],
    category_news[nums[4].i][nums[4].j][0],
  ];
} else if (channel !== null) {
  let [i, j] = channel.split("_");
  let data = channel_news[i][j];

  document.querySelector("title").innerText = data[1];

  article_title.innerText = data[1];
  article_header_desc.innerText = `2026.10.13 · ${data[0].replaceAll(/[0-9]+/g, "")}`;
  contents_node.innerHTML = data[5] ?? "";

  channel_img_node.setAttribute("src", getImgSrc(data[0]));
  channel_text_node.innerText = data[0];

  video_node.setAttribute("src", `video/${data[0]}${Number(j) + 1}.mp4`);

  nums = getRandomPairs(3, 5, i, j);
  news_list_articles[0] = [channel_news[nums[3].i][nums[3].j][1]];
  news_list_articles[1] = [channel_news[nums[3].i][nums[3].j][1]];
  news_list_articles[2] = [channel_news[nums[3].i][nums[3].j][1]];
  news_list_articles[3] = [
    channel_news[nums[3].i][nums[3].j][1],
    channel_news[nums[3].i][nums[3].j][2],
    `${channel_news[nums[3].i][nums[3].j][0]}4`,
  ];
  news_list_articles[4] = [
    channel_news[nums[3].i][nums[3].j][1],
    channel_news[nums[3].i][nums[3].j][2],
    `${channel_news[nums[3].i][nums[3].j][0]}5`,
  ];
}

const list_1 = document.getElementById("channel-news-list_1");
const list_2 = document.getElementById("channel-news-list_2");
const list_3 = document.getElementById("channel-news-list_3");
const list_4 = document.getElementById("channel-news-list_4");
const list_5 = document.getElementById("channel-news-list_5");

list_1.innerText = news_list_articles[0][0];
list_2.innerText = news_list_articles[1][0];
list_3.innerText = news_list_articles[2][0];

list_4.querySelector(".title").innerText = news_list_articles[3][0];
list_4.querySelector(".news-time").innerText = news_list_articles[3][1];
list_4
  .querySelector("img")
  .setAttribute("src", `img/thumbnail/news/${news_list_articles[3][2]}.webp`);

list_5.querySelector(".title").innerText = news_list_articles[4][0];
list_5.querySelector(".news-time").innerText = news_list_articles[4][1];
list_5
  .querySelector("img")
  .setAttribute("src", `img/thumbnail/news/${news_list_articles[4][2]}.webp`);

list_1.addEventListener("click", () => {
  location.href = getHref(nums[0].i, nums[0].j);
});

list_2.addEventListener("click", () => {
  location.href = getHref(nums[1].i, nums[1].j);
});
list_3.addEventListener("click", () => {
  location.href = getHref(nums[2].i, nums[2].j);
});
list_4.addEventListener("click", () => {
  location.href = getHref(nums[3].i, nums[3].j);
});
list_5.addEventListener("click", () => {
  location.href = getHref(nums[4].i, nums[4].j);
});

function handleShareClick(className) {
  let n = document.getElementById(className);

  n.style.opacity = n.style.opacity == 0 ? 100 : 0;
}
