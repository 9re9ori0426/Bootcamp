const swiper = new Swiper(".swiper-live-news", {
  speed: 600,
  slidesPerView: "auto",
  spaceBetween: 12,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },

  navigation: {
    nextEl: ".custom-next",
    prevEl: ".custom-prev",
  },
});

const swiperTag = new Swiper(".swiper-tag", {
  speed: 600,
  slidesPerView: "auto",
  spaceBetween: 6,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },
});

const swiperShorts = new Swiper(".swiper-shorts-news", {
  speed: 600,
  slidesPerView: 2.4,
  spaceBetween: 8,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },

  navigation: {
    nextEl: ".custom-next",
    prevEl: ".custom-prev",
  },
});

const swiperChannel = new Swiper(".swiper-channel", {
  speed: 600,
  slidesPerView: 5.5,
  spaceBetween: 10,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },
});

const swiperTagChannel = new Swiper(".swiper-tag-channel", {
  speed: 600,
  slidesPerView: "auto",
  spaceBetween: 6,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },
});

const swiperQuick = new Swiper(".swiper-quick-vod", {
  speed: 600,
  slidesPerView: 2,
  spaceBetween: 8,
  slidesOffsetBefore: 20,
  slidesOffsetAfter: 20,
  loop: false,
  freeMode: {
    enabled: true,
  },

  navigation: {
    nextEl: ".custom-next",
    prevEl: ".custom-prev",
  },
});
