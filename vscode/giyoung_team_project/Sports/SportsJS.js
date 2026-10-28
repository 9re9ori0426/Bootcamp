function openModal(selector) {
  document.querySelector(selector).classList.add("open");
}
function closeModal(selector) {
  document.querySelector(selector).classList.remove("open");
}

document.querySelectorAll("[data-close]").forEach(function (btn) {
  btn.addEventListener("click", function () {
    closeModal(btn.dataset.close);
  });
});

document.querySelector(".coupon-btn").addEventListener("click", function () {
  openModal(".coupon-modal");
});

function initSlider(slider, dotsBox) {
  const track = slider.querySelector(".slider-track");
  const prevBtn = slider.querySelector(".prev");
  const nextBtn = slider.querySelector(".next");
  const center = slider.classList.contains("slider-center");

  let index = 0;
  let pages = 1;
  let pageWidth = 0;
  let slideWidth = 0;
  let minOffset = 0;
  let maxOffset = 0;

  let dragging = false;
  let moved = false;
  let startX = 0;
  let startOffset = 0;

  function offsetFor(i) {
    if (center) return i * pageWidth - (slider.clientWidth - slideWidth) / 2;
    return Math.min(i * pageWidth, maxOffset);
  }

  function measure() {
    const gap = parseFloat(getComputedStyle(track).columnGap) || 0;
    if (center) {
      slideWidth = track.children[0].offsetWidth;
      pageWidth = slideWidth + gap;
      pages = track.children.length;
      minOffset = offsetFor(0);
      maxOffset = offsetFor(pages - 1);
      return;
    }
    pageWidth = slider.clientWidth + gap;
    maxOffset = Math.max(0, track.scrollWidth - slider.clientWidth);
    pages = Math.ceil(maxOffset / pageWidth - 0.01) + 1;
    minOffset = 0;
  }

  function buildDots() {
    dotsBox.innerHTML = "";
    for (let k = 0; k < pages; k++) {
      const dot = document.createElement("div");
      dot.className = "slider-dot";
      dot.addEventListener("click", function () {
        go(k);
      });
      dotsBox.appendChild(dot);
    }
  }

  function go(i) {
    index = Math.max(0, Math.min(i, pages - 1));
    track.style.transform = "translateX(" + -offsetFor(index) + "px)";
    dotsBox.querySelectorAll(".slider-dot").forEach(function (dot, k) {
      dot.classList.toggle("active", k === index);
    });
    prevBtn.classList.toggle("disabled", index === 0);
    nextBtn.classList.toggle("disabled", index === pages - 1);
  }

  function refresh() {
    measure();
    buildDots();
    go(index);
  }

  // 화살표 좌우반전
  prevBtn.addEventListener("click", function () {
    go(index - 1);
  });
  nextBtn.addEventListener("click", function () {
    go(index + 1);
  });

  // 마우스 드래그기능
  slider.addEventListener("pointerdown", function (e) {
    if (e.button !== 0) return;
    if (e.target.closest(".slider-arrow, .slider-dot")) return;
    dragging = true;
    moved = false;
    startX = e.clientX;
    startOffset = offsetFor(index);
  });

  slider.addEventListener("pointermove", function (e) {
    if (!dragging) return;
    const dx = e.clientX - startX;
    if (!moved && Math.abs(dx) > 5) {
      moved = true;
      slider.classList.add("dragging");
      slider.setPointerCapture(e.pointerId);
    }
    if (!moved) return;
    const offset = Math.max(
      minOffset - 80,
      Math.min(maxOffset + 80, startOffset - dx),
    );
    track.style.transform = "translateX(" + -offset + "px)";
  });

  function endDrag(e) {
    if (!dragging) return;
    dragging = false;
    slider.classList.remove("dragging");
    if (!moved) return;
    const dx = e.clientX - startX;
    if (dx < -50) go(index + 1);
    else if (dx > 50) go(index - 1);
    else go(index);
  }
  slider.addEventListener("pointerup", endDrag);
  slider.addEventListener("pointercancel", endDrag);

  // 클릭후 알림창 안뜨게 정상화
  slider.addEventListener(
    "click",
    function (e) {
      if (moved) {
        e.stopPropagation();
        e.preventDefault();
      }
      moved = false;
    },
    true,
  );

  // 그림? 복사되는 드래그 막아버리기
  slider.addEventListener("dragstart", function (e) {
    e.preventDefault();
  });

  window.addEventListener("resize", refresh);
  refresh();
}

const hero = document.querySelector(".hero-slider");
initSlider(hero, hero.querySelector(".slider-dots"));

const liveSlider = document.querySelector(".live-slider");
initSlider(liveSlider, document.querySelector(".live-section .slider-dots"));

// ===== 라이브 카운트다운 =====
const liveCards = document.querySelectorAll(".live-card");
const units = [" :", " :", ""];

function pad(n) {
  return String(n).padStart(2, "0");
}

function render(card) {
  const s = Number(card.dataset.seconds);
  const label = card.querySelector(".live-label");
  const times = card.querySelectorAll(".live-time");
  if (s <= 0) {
    label.textContent = "LIVE ON";
    times.forEach(function (t) {
      t.textContent = "";
    });
    card.classList.add("started");
    return;
  }
  const parts = [Math.floor(s / 3600), Math.floor((s % 3600) / 60), s % 60];
  times.forEach(function (t, i) {
    t.textContent = pad(parts[i]) + units[i];
  });
}

liveCards.forEach(render);

setInterval(function () {
  liveCards.forEach(function (card) {
    const s = Number(card.dataset.seconds);
    if (s > 0) card.dataset.seconds = s - 1;
    render(card);
  });
}, 1000);

liveCards.forEach(function (card) {
  card.addEventListener("click", function () {
    if (card.classList.contains("started")) return;
    openModal(".alert-modal");
  });
});
