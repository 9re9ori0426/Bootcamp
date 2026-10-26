document.addEventListener("DOMContentLoaded", function () {
    // 1. 눈송이를 담을 컨테이너 생성 및 스타일 설정
    const snowContainer = document.createElement("div");
    snowContainer.classList.add("snow-container");

    // CSS 스타일을 JS에서 동적으로 주입 (별도의 CSS 파일 수정 없이 바로 작동!)
    const style = document.createElement("style");
    style.innerHTML = `
        .snow-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100vw;
            height: 100vh;
            pointer-events: none; /* 클릭 방해 금지 */
            overflow: hidden;
            z-index: 9999; /* 폼 위로 눈이 내리게 설정 */
        }
        .snowflake {
            position: absolute;
            top: -10px;
            background: #ffffff;
            border-radius: 50%;
            opacity: 0.8;
            box-shadow: 0 0 8px #00f3ff, 0 0 12px #ffffff; /* 네온 전광판에 어울리게 빛나는 눈송이 */
            animation: fall linear infinite;
        }
        @keyframes fall {
            0% {
                transform: translateY(0) translateX(0);
            }
            50% {
                transform: translateY(50vh) translateX(20px);
            }
            100% {
                transform: translateY(105vh) translateX(-20px);
            }
        }
    `;

    document.head.appendChild(style);
    document.body.appendChild(snowContainer);

    // 2. 눈송이 개수 설정 (원하는 만큼 조절 가능)
    const snowflakeCount = 50;

    for (let i = 0; i < snowflakeCount; i++) {
        createSnowflake();
    }

    function createSnowflake() {
        const snowflake = document.createElement("div");
        snowflake.classList.add("snowflake");

        // 랜덤 크기 (2px ~ 7px)
        const size = Math.random() * 5 + 2;
        snowflake.style.width = `${size}px`;
        snowflake.style.height = `${size}px`;

        // 화면 가로 위치 랜덤 배치
        snowflake.style.left = `${Math.random() * 100}vw`;

        // 떨어지는 속도 랜덤 (3초 ~ 8초)
        const duration = Math.random() * 5 + 3;
        snowflake.style.animationDuration = `${duration}s`;

        // 애니메이션 지연 시간 (자연스럽게 퍼져서 내리도록)
        const delay = Math.random() * 5;
        snowflake.style.animationDelay = `${delay}s`;

        // 투명도 랜덤 조절
        snowflake.style.opacity = Math.random() * 0.7 + 0.3;

        snowContainer.appendChild(snowflake);
    }

    const colors = ["#ff007f", "#00f3ff", "#7928ca", "#ff3399", "#ffff00", "#00ff66"];

    // 폭죽 파편용 CSS 스타일 동적 주입
    const fireworkStyle = document.createElement("style");
    fireworkStyle.innerHTML = `
        .firework-particle {
            position: fixed;
            width: 6px;
            height: 6px;
            border-radius: 50%;
            pointer-events: none;
            z-index: 10000;
            animation: explode 0.8s ease-out forwards;
        }

        @keyframes explode {
            0% {
                transform: translate(0, 0) scale(1);
                opacity: 1;
            }
            100% {
                transform: translate(var(--dest-x), var(--dest-y)) scale(0);
                opacity: 0;
            }
        }
    `;
    document.head.appendChild(fireworkStyle);

    // 폭죽을 터뜨리는 함수
    function launchFirework() {
        // 화면 안의 랜덤한 좌표 계산 (가장자리 여백 10% 제외)
        const x = Math.random() * (window.innerWidth * 0.8) + (window.innerWidth * 0.1);
        const y = Math.random() * (window.innerHeight * 0.6) + (window.innerHeight * 0.1);

        const particleCount = 60; // 한 번에 터질 파편 개수

        for (let i = 0; i < particleCount; i++) {
            createParticle(x, y, colors);
        }
    }

    function createParticle(x, y, colors) {
        const particle = document.createElement("div");
        particle.classList.add("firework-particle");

        // 랜덤 네온 색상 및 발광 효과 부여
        const color = colors[Math.floor(Math.random() * colors.length)];
        particle.style.background = color;
        particle.style.boxShadow = `0 0 8px ${color}, 0 0 15px ${color}`;

        // 시작 위치 (폭죽 터지는 중심 좌표)
        particle.style.left = `${x}px`;
        particle.style.top = `${y}px`;

        // 사방으로 퍼져나갈 랜덤 각도와 거리 계산
        const angle = Math.random() * Math.PI * 2;
        const speed = Math.random() * 120 + 40; // 퍼지는 속도/거리
        const destinationX = Math.cos(angle) * speed;
        const destinationY = Math.sin(angle) * speed;

        particle.style.setProperty('--dest-x', `${destinationX}px`);
        particle.style.setProperty('--dest-y', `${destinationY}px`);

        document.body.appendChild(particle);

        // 애니메이션 끝난 후 DOM에서 제거
        setTimeout(() => {
            particle.remove();
        }, 800);
    }

    // 0.8초 ~ 1.8초 간격으로 무작위 위치에서 폭죽 자동 발사!
    function randomFireworkLoop() {
        launchFirework();
        const nextTime = Math.random() * 500; // 0.8초~1.8초 사이 랜덤 텀
        setTimeout(randomFireworkLoop, nextTime);
    }

    // 실행 시작
    randomFireworkLoop();
});