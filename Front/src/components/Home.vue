<template>
  <div>
    <svg class="hidden">
      <symbol id="icon-arrow" viewBox="0 0 24 24">
        <title>arrow</title>
        <polygon points="6.3,12.8 20.9,12.8 20.9,11.2 6.3,11.2 10.2,7.2 9,6 3.1,12 9,18 10.2,16.8 " />
      </symbol>
      <symbol id="icon-drop" viewBox="0 0 24 24">
        <title>drop</title>
        <path
          d="M12,21c-3.6,0-6.6-3-6.6-6.6C5.4,11,10.8,4,11.4,3.2C11.6,3.1,11.8,3,12,3s0.4,0.1,0.6,0.3c0.6,0.8,6.1,7.8,6.1,11.2C18.6,18.1,15.6,21,12,21zM12,4.8c-1.8,2.4-5.2,7.4-5.2,9.6c0,2.9,2.3,5.2,5.2,5.2s5.2-2.3,5.2-5.2C17.2,12.2,13.8,7.3,12,4.8z" />
        <path
          d="M12,18.2c-0.4,0-0.7-0.3-0.7-0.7s0.3-0.7,0.7-0.7c1.3,0,2.4-1.1,2.4-2.4c0-0.4,0.3-0.7,0.7-0.7c0.4,0,0.7,0.3,0.7,0.7C15.8,16.5,14.1,18.2,12,18.2z" />
      </symbol>
      <symbol id="icon-github" viewBox="0 0 32.6 31.8">
        <title>github</title>
        <path
          d="M16.3,0C7.3,0,0,7.3,0,16.3c0,7.2,4.7,13.3,11.1,15.5c0.8,0.1,1.1-0.4,1.1-0.8c0-0.4,0-1.4,0-2.8c-4.5,1-5.5-2.2-5.5-2.2c-0.7-1.9-1.8-2.4-1.8-2.4c-1.5-1,0.1-1,0.1-1c1.6,0.1,2.5,1.7,2.5,1.7c1.5,2.5,3.8,1.8,4.7,1.4c0.1-1.1,0.6-1.8,1-2.2c-3.6-0.4-7.4-1.8-7.4-8.1c0-1.8,0.6-3.2,1.7-4.4C7.4,10.7,6.8,9,7.7,6.8c0,0,1.4-0.4,4.5,1.7c1.3-0.4,2.7-0.5,4.1-0.5c1.4,0,2.8,0.2,4.1,0.5c3.1-2.1,4.5-1.7,4.5-1.7c0.9,2.2,0.3,3.9,0.2,4.3c1,1.1,1.7,2.6,1.7,4.4c0,6.3-3.8,7.6-7.4,8c0.6,0.5,1.1,1.5,1.1,3c0,2.2,0,3.9,0,4.5c0,0.4,0.3,0.9,1.1,0.8c6.5-2.2,11.1-8.3,11.1-15.5C32.6,7.3,25.3,0,16.3,0z" />
      </symbol>
      <symbol id="icon-keyboard" viewBox="0 0 100 70">
        <title>keyboard</title>
        <!-- https://thenounproject.com/term/keyboard/783/ by Paul te Kortschot from the Noun Project -->
        <path
          d="M 60.94,1.83 39.22,1.83 C 36.71,1.83 34.67,3.86 34.67,6.376 L 34.67,28.1 C 34.67,30.61 36.71,32.65 39.22,32.65 L 60.94,32.65 C 63.45,32.65 65.5,30.61 65.5,28.1 L 65.5,6.376 C 65.5,3.86 63.45,1.83 60.94,1.83 Z M 44.79,18.63 50.08,11.74 55.37,18.63 Z"
          opacity="0.2" />
        <path
          d="M 60.86,36.75 39.14,36.75 C 36.63,36.75 34.59,38.79 34.59,41.3 L 34.59,63.02 C 34.59,65.53 36.63,67.57 39.14,67.57 L 60.86,67.57 C 63.38,67.57 65.41,65.53 65.41,63.02 L 65.41,41.3 C 65.42,38.79 63.38,36.75 60.86,36.75 Z M 50.08,57.45 44.79,50.55 55.37,50.55 Z"
          opacity="0.2" />
        <path
          d="M 95.45,36.75 73.73,36.75 C 71.22,36.75 69.18,38.79 69.18,41.3 L 69.18,63.02 C 69.18,65.53 71.22,67.57 73.73,67.57 L 95.45,67.57 C 97.97,67.57 100,65.53 100,63.02 L 100,41.3 C 100,38.79 97.97,36.75 95.45,36.75 Z M 83.4,57.45 83.4,46.86 90.3,52.16 Z" />
        <path
          d="M 26.27,36.75 4.55,36.75 C 2.037,36.75 0,38.79 0,41.3 L 0,63.02 C 0,65.53 2.037,67.57 4.55,67.57 L 26.27,67.57 C 28.78,67.57 30.82,65.53 30.82,63.02 L 30.82,41.3 C 30.82,38.79 28.78,36.75 26.27,36.75 Z M 16.69,57.45 9.79,52.16 16.69,46.86 Z" />
      </symbol>
    </svg>
    <main>
      <div class="message">Please view this demo on a desktop.</div>
      <div class="content">
        <svg class="scene" width="100%" height="100vh" preserveAspectRatio="none" viewBox="0 0 1440 800"
          xmlns:pathdata="http://www.codrops.com/">
          <path
            d="M 1066,436 C 1051,543.8 973.2,656.2 873.6,700.1 756.6,751.7 600.9,725 492.4,657.4 431.5,619.5 387.5,546.9 376.7,476 360.3,368.3 377.9,229.2 462.5,160.5 589.5,57.34 815.4,42.24 952.4,131.7 1044,190.8 1081,328.8 1066,436 Z"
            pathdata:id="M 1041,450.4 C 1023,547.7 992.8,667.7 905.7,714.5 793.1,775 639,728.7 524.5,671.8 453.3,636.4 382.2,575.4 360.2,499 329.7,393 344.6,249.2 426,174.9 568.6,44.66 851.1,-8.71 1002,111.8 1091,182.7 1061,338.6 1041,450.4 Z;M 1066,436 C 1051,543.8 976.5,664.5 873.6,700.1 761,739.1 636.4,655.8 529.5,603.1 441.6,559.8 325.8,520.1 293.8,427.5 263.1,338.4 294.5,213.4 368.2,154.8 520.7,33.48 790.1,23.76 952.4,131.7 1043,191.7 1081,328.8 1066,436 Z;M 1066,436 C 1053,531.1 930.7,580.1 842.2,617.2 734,662.7 598.4,707.8 492.4,657.4 427.6,626.6 387.5,546.9 376.7,476 360.3,368.3 376.9,227.9 462.5,160.5 567.6,77.69 749.9,37.5 863.8,148.8 947.6,230.7 1082,320.1 1066,436 Z" />
        </svg>
        <h2 class="title">CarePlanner</h2>
      </div>
    </main>
  </div>
</template>
<script>
  import anime from 'animejs'
  export default {
    // data() {},
    methods: {},
    mounted() {
      {
        setTimeout(() => document.body.classList.add('render'), 60);
        const navdemos = Array.from(document.querySelectorAll('nav.demos > .demo'));
        const total = navdemos.length;
        const current = navdemos.findIndex(el => el.classList.contains('demo--current'));
        const navigate = (linkEl) => {
          document.body.classList.remove('render');
          document.body.addEventListener('transitionend', () => window.location = linkEl.href);
        };
        navdemos.forEach(link => link.addEventListener('click', (ev) => {
          ev.preventDefault();
          navigate(ev.target);
        }));
        document.addEventListener('keydown', (ev) => {
          const keyCode = ev.keyCode || ev.which;
          let linkEl;
          if (keyCode === 37) {
            linkEl = current > 0 ? navdemos[current - 1] : navdemos[total - 1];
          } else if (keyCode === 39) {
            linkEl = current < total - 1 ? navdemos[current + 1] : navdemos[0];
          } else {
            return false;
          }
          navigate(linkEl);
        });
      }
      {
        // equation of a line
        const lineEq = (y2, y1, x2, x1, currentVal) => {
          // y = mx + b
          const m = (y2 - y1) / (x2 - x1);
          const b = y1 - m * x1;

          return m * currentVal + b;
        }

        // from http://www.quirksmode.org/js/events_properties.html#position
        const getMousePos = (e) => {
          let posx = 0;
          let posy = 0;
          if (!e) {
            let e = window.event
          };
          if (e.pageX || e.pageY) {
            posx = e.pageX;
            posy = e.pageY;
          } else if (e.clientX || e.clientY) {
            posx = e.clientX + document.body.scrollLeft +
              document.documentElement.scrollLeft;
            posy = e.clientY + document.body.scrollTop +
              document.documentElement.scrollTop;
          }
          return {
            x: posx,
            y: posy
          };
        };

        // From https://davidwalsh.name/javascript-debounce-function.
        function debounce(func, wait, immediate) {
          var timeout;
          return function () {
            var context = this,
              args = arguments;
            var later = function () {
              timeout = null;
              if (!immediate) func.apply(context, args);
            };
            var callNow = immediate && !timeout;
            clearTimeout(timeout);
            timeout = setTimeout(later, wait);
            if (callNow) func.apply(context, args);
          };
        };

        class MorphingBG {
          constructor(el) {
            this.DOM = {};
            this.DOM.el = el;
            this.DOM.el.style.opacity = 0;
            this.DOM.el.style.transition = 'transform 2s ease-out';
            this.DOM.pathEl = this.DOM.el.querySelector('path');
            this.paths = this.DOM.pathEl.getAttribute('pathdata:id').split(';')
            this.paths.splice(this.paths.length, 0, this.DOM.pathEl.getAttribute('d'));
            this.win = {
              width: window.innerWidth,
              height: window.innerHeight
            };
            this.animate();
            this.initEvents();
          }
          animate() {
            anime.remove(this.DOM.pathEl);
            anime({
              targets: this.DOM.pathEl,
              duration: 10000,
              easing: 'cubicBezier(0.5, 0, 0.5, 1)',
              d: this.paths,
              loop: true
            });
          }
          initEvents() {
            // Mousemove event / Tilt functionality.
            const tilt = {
              tx: this.win.width / 8,
              ty: this.win.height / 4,
              rz: 45,
              sx: [0.8, 2],
              sy: [0.8, 2]
            }
            const onMouseMoveFn = (ev) => {
              requestAnimationFrame(() => {
                if (!this.started) {
                  this.started = true;
                  anime({
                    targets: this.DOM.el,
                    duration: 300,
                    easing: 'linear',
                    opacity: [0, 1]
                  });
                } else {
                  const mousepos = getMousePos(ev);
                  const rotZ = 2 * tilt.rz / this.win.height * mousepos.y - tilt.rz;
                  const scaleX = mousepos.x < this.win.width / 2 ? lineEq(tilt.sx[0], tilt.sx[1], this.win
                    .width / 2, 0, mousepos.x) : lineEq(tilt.sx[1], tilt.sx[0], this.win.width, this.win
                    .width / 2, mousepos.x);
                  const scaleY = mousepos.y < this.win.height / 2 ? lineEq(tilt.sy[0], tilt.sy[1], this.win
                    .height / 2, 0, mousepos.y) : lineEq(tilt.sy[1], tilt.sy[0], this.win.height, this.win
                    .height / 2, mousepos.y);
                  const transX = 2 * tilt.tx / this.win.width * mousepos.x - tilt.tx;
                  const transY = 2 * tilt.ty / this.win.height * mousepos.y - tilt.ty;

                  this.DOM.el.style.transform =
                    `translate3d(${transX}px, ${transY}px,0) rotate3d(0,0,1,${rotZ}deg) scale3d(${scaleX},${scaleY},1)`;
                }
              });
            };

            // Window resize.
            const onResizeFn = debounce(() => this.win = {
              width: window.innerWidth,
              height: window.innerHeight
            }, 20);

            document.addEventListener('mousemove', onMouseMoveFn);
            document.addEventListener('touchstart', onMouseMoveFn);
            window.addEventListener('resize', ev => onResizeFn());
          }
        };

        new MorphingBG(document.querySelector('svg.scene'));
      };
    }
  }

</script>
<style scoped>
  article,
  aside,
  details,
  figcaption,
  figure,
  footer,
  header,
  hgroup,
  main,
  nav,
  section,
  summary {
    display: block;
  }

  audio,
  canvas,
  video {
    display: inline-block;
  }

  audio:not([controls]) {
    display: none;
    height: 0;
  }

  [hidden] {
    display: none;
  }

  html {
    font-family: sans-serif;
    -ms-text-size-adjust: 100%;
    -webkit-text-size-adjust: 100%;
  }

  body {
    margin: 0;
  }

  a:focus {
    outline: thin dotted;
  }

  a:active,
  a:hover {
    outline: 0;
  }

  h1 {
    font-size: 2em;
    margin: 0.67em 0;
  }

  abbr[title] {
    border-bottom: 1px dotted;
  }

  b,
  strong {
    font-weight: bold;
  }

  dfn {
    font-style: italic;
  }

  hr {
    -moz-box-sizing: content-box;
    box-sizing: content-box;
    height: 0;
  }

  mark {
    background: #ff0;
    color: #000;
  }

  code,
  kbd,
  pre,
  samp {
    font-family: monospace, serif;
    font-size: 1em;
  }

  pre {
    white-space: pre-wrap;
  }

  q {
    quotes: "\201C""\201D""\2018""\2019";
  }

  small {
    font-size: 80%;
  }

  sub,
  sup {
    font-size: 75%;
    line-height: 0;
    position: relative;
    vertical-align: baseline;
  }

  sup {
    top: -0.5em;
  }

  sub {
    bottom: -0.25em;
  }

  img {
    border: 0;
  }

  svg:not(:root) {
    overflow: hidden;
  }

  figure {
    margin: 0;
  }

  fieldset {
    border: 1px solid #c0c0c0;
    margin: 0 2px;
    padding: 0.35em 0.625em 0.75em;
  }

  legend {
    border: 0;
    padding: 0;
  }

  button,
  input,
  select,
  textarea {
    font-family: inherit;
    font-size: 100%;
    margin: 0;
  }

  button,
  input {
    line-height: normal;
  }

  button,
  select {
    text-transform: none;
  }

  button,
  html input[type="button"],
  input[type="reset"],
  input[type="submit"] {
    -webkit-appearance: button;
    cursor: pointer;
  }

  button[disabled],
  html input[disabled] {
    cursor: default;
  }

  input[type="checkbox"],
  input[type="radio"] {
    box-sizing: border-box;
    padding: 0;
  }

  input[type="search"] {
    -webkit-appearance: textfield;
    -moz-box-sizing: content-box;
    -webkit-box-sizing: content-box;
    box-sizing: content-box;
  }

  input[type="search"]::-webkit-search-cancel-button,
  input[type="search"]::-webkit-search-decoration {
    -webkit-appearance: none;
  }

  button::-moz-focus-inner,
  input::-moz-focus-inner {
    border: 0;
    padding: 0;
  }

  textarea {
    overflow: auto;
    vertical-align: top;
  }

  table {
    border-collapse: collapse;
    border-spacing: 0;
  }

  *,
  *::after,
  *::before {
    box-sizing: border-box;
  }

  .demo-4 {
    --color-text: #81838c;
    --color-background: #272927;
    --color-link: #96e23e;
    --color-link-hover: #fff;
    --color-info: #ea7836;
  }
  /* Fade effect */
  /* .js body {
    opacity: 0;
    transition: opacity 0.3s;

  }

  .js body.render {
    opacity: 1;
  } */

  a {
    text-decoration: none;
    color: #5d93d8;
    color: var(--color-link);
    outline: none;
  }

  a:hover,
  a:focus {
    color: #423c2b;
    color: var(--color-link-hover);
    outline: none;
  }

  .hidden {
    position: absolute;
    overflow: hidden;
    width: 0;
    height: 0;
    pointer-events: none;
  }

  .message {
    background: var(--color-text);
    color: var(--color-background);
    text-align: center;
    padding: 1em;
    display: none;
    position: relative;
    z-index: 100;
  }

  main {
    position: relative;
    width: 100%;
  }

  .content {
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    margin: 0 auto;
  }

  .content--fixed {
    position: fixed;
    z-index: 10000;
    top: 0;
    left: 0;
    display: grid;
    align-content: space-between;
    width: 100%;
    max-width: none;
    height: 100vh;
    padding: 1.5em;
    pointer-events: none;
    grid-template-columns: 50% 50%;
    grid-template-rows: auto auto 4em;
    grid-template-areas: 'header ...'
      '... ...'
      'github demos';
  }

  .content--fixed a {
    pointer-events: auto;
  }

  /* Header */
  .codrops-header {
    position: relative;
    z-index: 100;
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    align-items: center;
    align-self: start;
    grid-area: header;
    justify-self: start;
  }

  .codrops-header__title {
    font-size: 1em;
    font-weight: bold;
    margin: 0;
    padding: 0.75em 0;
  }

  .info {
    margin: 0 0 0 1.25em;
    font-style: italic;
    color: var(--color-info);
    font-weight: bold;
  }

  .github {
    display: block;
    align-self: end;
    grid-area: github;
    justify-self: start;
  }

  .demos {
    position: relative;
    display: block;
    align-self: end;
    text-align: center;
    grid-area: demos;
  }

  .demo {
    margin: 0 0.15em;
  }

  .demo:hover,
  .demo:focus {
    opacity: 0.5;
  }

  .demo span {
    white-space: nowrap;
    text-transform: lowercase;
    pointer-events: none;
  }

  .demo span::before {
    content: '#';
  }

  a.demo--current {
    pointer-events: none;
  }

  /* Top Navigation Style */
  .codrops-links {
    position: relative;
    display: flex;
    justify-content: center;
    margin: 0 1em 0 0;
    text-align: center;
    white-space: nowrap;
  }

  .codrops-icon {
    display: inline-block;
    margin: 0.15em;
    padding: 0.25em;
  }

  .scene {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100vh;
    pointer-events: none;
    z-index: 1;
  }

  @media screen and (min-width: 55em) {
    .icon--keyboard {
      position: absolute;
      right: 0.55em;
      bottom: -30%;
      display: block;
      width: 54px;
      height: 46px;
      fill: var(--color-link);
    }

    .demos {
      display: flex;
      padding-right: 80px;
      justify-self: end;
    }

    .demo {
      display: block;
      width: 17px;
      height: 17px;
      margin: 0 4px;
      border-radius: 50%;
      background: var(--color-link);
    }

    a.demo--current {
      background: var(--color-link-hover);
    }

    .demo span {
      position: absolute;
      line-height: 1;
      right: 100%;
      display: none;
      margin: 0 1em 0 0;
    }

    .demo--current span {
      display: block;
    }
  }

  @media screen and (max-width: 55em) {

    html,
    body {
      overflow-x: hidden;
      width: 100vw;
      height: 100%;
    }

    .message {
      display: block;
    }

    .content {
      height: auto;
      min-height: 0;
      padding-bottom: 10em;
      flex-direction: column;
    }

    .content--fixed {
      position: relative;
      z-index: 1000;
      display: block;
      padding: 0.85em;
    }

    .codrops-header {
      flex-direction: column;
      align-items: center;
    }

    .codrops-header__title {
      font-weight: bold;
      padding-bottom: 0.25em;
      text-align: center;
    }

    .github {
      display: block;
      margin: 1em auto;
    }

    .codrops-links {
      margin: 0;
    }
  }

  .title {
    color: #fff;
    font-size: 6vw;
    font-weight: 400;
    z-index: 1000;
    font-family:Helvetica, Arial, sans-serif;
    pointer-events: none;
  }

  .scene path {
    fill: #171817;
  }

  .pater {
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Helvetica, Arial, sans-serif !important;
    position: fixed;
    z-index: 1000;
    right: 0;
    bottom: 0;
    display: grid;
    width: 100%;
    padding: 1em 0;
    text-align: left;
    color: #333;
    background: #ddd;
    grid-template-columns: auto;
    grid-template-rows: auto auto auto;
  }

  .pater:hover,
  .pater:focus {
    color: #000;
  }

  .pater--theme-alt {
    background: #333333;
    color: #e2e2e2;
  }

  .pater--theme-alt:hover,
  .pater--theme-alt:focus {
    color: #fff;
  }

  .pater::before {
    content: 'Our Sponsor';
    font-size: 0.75em;
    display: inline-block;
    padding: 0 0 5px 10px;
    vertical-align: middle;
    grid-area: 1 / 1 / 2 / 2;
  }

  .pater__img {
    display: none;
    overflow: hidden;
    /* background-image: url(jetpack.png); */
    background-size: cover;
    grid-area: 2 / 1 / 3 / 2;
  }

  .pater__img-inner {
    /* background: url(jetpack_man.png) no-repeat 0 100%; */
    background-size: 150px;
    width: 100%;
    height: 100%;
  }

  .pater:hover .pater__img-inner {
    animation: animMan 0.4s cubic-bezier(0.1, 1, 0.3, 1) forwards;
  }

  @keyframes animMan {
    25% {
      opacity: 0;
      transform: translate3d(0, 0, 0);
    }

    26% {
      opacity: 0;
      transform: translate3d(-100%, 100%, 0) scale3d(0.1, 0.1, 1);
    }

    100% {
      opacity: 1;
      transform: translate3d(0, 0, 0);
    }
  }

  .pater__title {
    font-size: 0.85em;
    font-weight: normal;
    font-weight: bold;
    align-self: end;
    margin: 0;
  }

  .pater__title,
  .pater__description {
    align-self: start;
    padding: 10px 0 0 10px;
    grid-area: 2 / 1 / 3 / 3;
  }

  .pater__description {
    font-size: 0.85em;
    display: none;
    margin: 0;
    opacity: 0;
  }

  .pater__description strong {
    display: block;
    padding-top: 5px;
    color: #ee4e97;
  }

  @media screen and (min-width: 60em) {
    .pater {
      top: 0;
      right: 0;
      bottom: auto;
      width: calc(180px + 2em);
      margin: 0 1.5em 0 0;
      padding: 0;
      padding: 1em;
      text-align: right;
      border-radius: 0 0 5px 5px;
      background: #f9f9f9;
    }

    .pater--theme-alt {
      background: #333333;
    }

    .pater__img {
      display: flex;
      width: 100%;
      height: 180px;
    }

    .pater::before {
      display: block;
      padding: 0 0 10px 0;
    }

    .pater:hover .pater__title {
      opacity: 0;
    }

    .pater:hover .pater__description {
      opacity: 1;
    }

    .pater__description {
      display: block;
    }

    .pater__title {
      padding: 10px;
    }

    .pater__title,
    .pater__description {
      padding-left: 0;
      transition: opacity 0.5s;
      grid-area: 3 / 1 / 4 / 2;
    }
  }

</style>
