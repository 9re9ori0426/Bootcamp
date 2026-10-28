function clearChild(parent) {
  while (parent.firstChild) {
    parent.removeChild(parent.firstChild);
  }
}

// 지금 방송중인뉴스
const swiper_live_news_wrapper_nodes =
  document.getElementById("swiper-live-news");

lives.map((v, i) => {
  let slide = document.createElement("div");
  slide.setAttribute("class", "swiper-slide live-news-slide");
  let news_wrap = document.createElement("div");
  news_wrap.setAttribute("class", "live-news-wrap");

  let thumbnail = document.createElement("img");
  thumbnail.setAttribute("class", "thumbnail");
  thumbnail.setAttribute("src", `img/thumbnail/live-news/${v.id}.jpg`);

  let desc = document.createElement("div");
  desc.setAttribute("class", "live-news-desc");

  let rank = document.createElement("img");
  rank.setAttribute("src", `img/live-news/ranking_${i + 1}_svg__a.svg`);

  let list = document.createElement("div");
  list.setAttribute("class", "live-news-desc-list");
  let channel = document.createElement("div");
  channel.innerText = v.channel;
  let name = document.createElement("div");
  name.innerText = v.name;
  let rate = document.createElement("div");
  rate.innerText = `${v.rate}%`;

  news_wrap.append(thumbnail);
  if (v.free == true) {
    let free_tag = document.createElement("img");
    free_tag.setAttribute("class", "free");
    free_tag.setAttribute("src", "img/live-news/free.svg");
    news_wrap.append(free_tag);
  }
  slide.append(news_wrap);
  desc.append(rank);
  list.append(channel);
  list.append(name);
  list.append(rate);
  desc.append(list);
  slide.append(desc);

  swiper_live_news_wrapper_nodes.append(slide);
});

//shorts
const news_shorts_wrapper_node = document.getElementById("swiper-shorts");

shorts.map((v, i) => {
  let slide = document.createElement("div");
  slide.setAttribute("class", "swiper-slide shorts-news-slide");

  let thumbnail = document.createElement("img");
  thumbnail.setAttribute("src", `img/thumbnail/shorts/${i + 1}.webp`);

  let text = document.createElement("div");
  text.innerText = v;

  slide.append(thumbnail);
  slide.append(text);

  news_shorts_wrapper_node.append(slide);
});

//vod
const news_vod_wrapper_node = document.getElementById("swiper-vod");

for (let i = 0; i < 16; i++) {
  let slide = document.createElement("div");
  slide.setAttribute("class", "swiper-slide quick-vod-slide");

  let thumbnail = document.createElement("img");
  thumbnail.setAttribute("src", `img/thumbnail/vod/${i + 1}.webp`);

  let quick_tag = document.createElement("div");
  quick_tag.setAttribute("class", "quick");
  let quick_img = document.createElement("img");
  quick_img.setAttribute("src", "img/icon/tving_quick.svg");
  quick_tag.append(quick_img);

  slide.append(thumbnail);
  slide.append(quick_tag);

  news_vod_wrapper_node.append(slide);
}

//sports
const sports_wrapper_node = document.getElementById("sports-highlight");

function changeSportPage(currentPage) {
  clearChild(sports_wrapper_node);
  let data = sports.slice((currentPage - 1) * 4, currentPage * 4);
  let offset = (currentPage - 1) * 4;

  for (let i = 0; i < 2; i++) {
    let col = document.createElement("div");
    col.setAttribute("class", "sports-col");

    for (let j = 0; j < 2; j++) {
      let wrap = document.createElement("div");
      wrap.setAttribute("class", "sports-wrap");

      let thumbnail = document.createElement("div");
      thumbnail.setAttribute("class", "sports-thumbnail");

      let img = document.createElement("img");
      img.setAttribute(
        "src",
        `img/thumbnail/sports/${offset + i * 2 + j + 1}.webp`,
      );
      let time = document.createElement("div");
      time.setAttribute("class", "news-time");
      time.innerHTML = data[i * 2 + j][1];

      let desc = document.createElement("div");
      desc.setAttribute("class", "sports-desc");

      let num = document.createElement("img");
      num.setAttribute("src", `img/icon_num/${offset + i * 2 + j + 1}.svg`);
      let text = document.createElement("div");
      text.innerHTML = data[i * 2 + j][0];

      thumbnail.append(img);
      thumbnail.append(time);
      desc.append(num);
      desc.append(text);
      wrap.append(thumbnail);
      wrap.append(desc);
      col.append(wrap);
    }

    sports_wrapper_node.append(col);
  }

  let pagination = document.getElementById("sports-pagination-num");
  pagination.innerText = currentPage;
}

function handleSportsNextPage() {
  let currentPage = Number(sports_wrapper_node.getAttribute("data-page"));

  if (currentPage >= 5) {
    sports_wrapper_node.setAttribute("data-page", 1);

    changeSportPage(1);
  } else {
    sports_wrapper_node.setAttribute("data-page", currentPage + 1);

    changeSportPage(currentPage + 1);
  }
}

function handleSportsPrevPage() {
  let currentPage = Number(sports_wrapper_node.getAttribute("data-page"));

  if (currentPage <= 1) {
    sports_wrapper_node.setAttribute("data-page", 5);

    changeSportPage(5);
  } else {
    sports_wrapper_node.setAttribute("data-page", currentPage - 1);

    changeSportPage(currentPage - 1);
  }
}

// category
// img_id, title, time, channel, 분전, ?기사
const category_wrapper_node = document.getElementById("category-list");

function changeCategoryPage(currentPage) {
  clearChild(category_wrapper_node);
  let currentTab = Number(
    document.getElementById("swiper-category").getAttribute("data-category"),
  );
  let data = category_news[currentTab].slice(
    (currentPage - 1) * 5,
    currentPage * 5,
  );

  if (data.length == 0) {
    return;
  }

  for (let i = 0; i < 5; i++) {
    let wrap = document.createElement("div");
    wrap.setAttribute("class", "news-wrap");

    let desc = document.createElement("div");
    desc.setAttribute("class", "news-desc");

    let title = document.createElement("div");
    title.innerText = data[i][1];

    let desc_text = document.createElement("div");
    desc_text.innerText = `${data[i][3]} ・ ${data[i][4]}`;

    let thumbnail = document.createElement("div");

    let img = document.createElement("img");
    img.setAttribute("src", `img/thumbnail/news/${data[i][0]}.webp`);

    let time = document.createElement("div");
    time.setAttribute("class", "news-time");
    time.innerHTML = data[i][2];

    desc.append(title);
    desc.append(desc_text);
    thumbnail.append(img);
    thumbnail.append(time);
    wrap.append(desc);
    wrap.append(thumbnail);

    wrap.addEventListener("click", () => {
      location.href = `news.html?category=${currentTab}_${i}`;
    });

    category_wrapper_node.append(wrap);

    if (i !== 4) {
      let divider = document.createElement("div");
      divider.setAttribute("class", "divider");
      category_wrapper_node.append(divider);
    }
  }

  let pagination = document.getElementById("news-category-pagination-num");
  pagination.innerText = currentPage;
}

function handleCategoryNextPage() {
  let currentPage = Number(category_wrapper_node.getAttribute("data-page"));

  if (currentPage >= 5) {
    category_wrapper_node.setAttribute("data-page", 1);

    changeCategoryPage(1);
  } else {
    category_wrapper_node.setAttribute("data-page", currentPage + 1);

    changeCategoryPage(currentPage + 1);
  }
}

function handleCategoryPrevPage() {
  let currentPage = Number(category_wrapper_node.getAttribute("data-page"));

  if (currentPage <= 1) {
    category_wrapper_node.setAttribute("data-page", 5);

    changeCategoryPage(5);
  } else {
    category_wrapper_node.setAttribute("data-page", currentPage - 1);

    changeCategoryPage(currentPage - 1);
  }
}

//카테고리 최신뉴스
const news_category = document
  .getElementById("swiper-category")
  .querySelectorAll(".tag");

function handleClickTag(num) {
  for (let i = 0; i < news_category.length; i++) {
    let n = news_category[i];
    if (i == num) {
      n.classList.add("current");
      document
        .getElementById("swiper-category")
        .setAttribute("data-category", i);
      changeCategoryPage(1);
      // 전체 까지 포함
    } else {
      n.classList.remove("current");
    }
  }
}

news_category.forEach((v, i) => {
  v.addEventListener("click", () => handleClickTag(i));
});

changeCategoryPage(1);

// channel
// title, time, 분전, category, 기사
const channel_wrapper_node = document.getElementById("channel-list");

function changeChannelPage(currentPage) {
  clearChild(channel_wrapper_node);
  let currentTab = Number(
    document
      .getElementById("swiper-channel-category")
      .getAttribute("data-channel"),
  );
  let data = channel_news[currentTab].slice(
    (currentPage - 1) * 5,
    currentPage * 5,
  );
  // let offset = (currentPage - 1) * 5;

  for (let i = 0; i < 5; i++) {
    let wrap = document.createElement("div");
    wrap.setAttribute("class", "news-wrap");

    let desc = document.createElement("div");
    desc.setAttribute("class", "news-desc");

    let title = document.createElement("div");
    title.innerText = data[i][1];

    let desc_text = document.createElement("div");
    desc_text.innerText = `${data[i][0]} ・ ${data[i][3]}`;

    let thumbnail = document.createElement("div");

    let img = document.createElement("img");
    img.setAttribute("src", `img/thumbnail/news/${data[i][0]}${i + 1}.webp`);

    let time = document.createElement("div");
    time.setAttribute("class", "news-time");
    time.innerHTML = data[i][2];

    desc.append(title);
    desc.append(desc_text);
    thumbnail.append(img);
    thumbnail.append(time);
    wrap.append(desc);
    wrap.append(thumbnail);

    wrap.addEventListener("click", () => {
      location.href = `news.html?channel=${currentTab}_${i}`;
    });

    channel_wrapper_node.append(wrap);

    if (i !== 4) {
      let divider = document.createElement("div");
      divider.setAttribute("class", "divider");
      channel_wrapper_node.append(divider);
    }
  }

  let pagination = document.getElementById("news-channel-pagination-num");
  pagination.innerText = currentPage;
}

function handleChannelNextPage() {
  let currentPage = Number(channel_wrapper_node.getAttribute("data-page"));

  if (currentPage >= 5) {
    channel_wrapper_node.setAttribute("data-page", 1);

    changeChannelPage(1);
  } else {
    channel_wrapper_node.setAttribute("data-page", currentPage + 1);

    changeChannelPage(currentPage + 1);
  }
}

function handleChannelPrevPage() {
  let currentPage = Number(channel_wrapper_node.getAttribute("data-page"));

  if (currentPage <= 1) {
    channel_wrapper_node.setAttribute("data-page", 5);

    changeChannelPage(5);
  } else {
    channel_wrapper_node.setAttribute("data-page", currentPage - 1);

    changeChannelPage(currentPage - 1);
  }
}

// 채널 최신 뉴스
const news_channel_category = document
  .getElementById("swiper-channel-category")
  .querySelectorAll(".channel-tag");

function handleClickTagChannel(num) {
  for (let i = 0; i < news_channel_category.length; i++) {
    let n = news_channel_category[i];
    if (i == num) {
      n.classList.add("current");
      document
        .getElementById("swiper-channel-category")
        .setAttribute("data-channel", i);
      changeChannelPage(1);
    } else {
      n.classList.remove("current");
    }
  }
}

news_channel_category.forEach((v, i) => {
  v.addEventListener("click", () => handleClickTagChannel(i));
});

changeChannelPage(1);
