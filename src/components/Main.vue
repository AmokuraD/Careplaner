<template>
  <div>
    <!-- navigation -->
    <nav class="pages-nav">
      <div class="pages-nav__item"><a class="link link--page" href="#page-home">Home</a></div>
      <div class="pages-nav__item"><a class="link link--page" href="#page-docu">Documentation</a></div>
      <div class="pages-nav__item"><a class="link link--page" href="#page-manuals">Manuals</a></div>
      <div class="pages-nav__item"><a class="link link--page" href="#page-software">Software</a></div>
      <div class="pages-nav__item"><a class="link link--page" href="#page-custom">Customization &amp; Settings</a></div>
      <div class="pages-nav__item"><a class="link link--page" href="#page-training">Training</a></div>
      <div class="pages-nav__item pages-nav__item--small"><a class="link link--page link--faded" href="#page-buy">Where
          to buy</a></div>
      <div class="pages-nav__item pages-nav__item--small"><a class="link link--page link--faded" href="#page-blog">Blog
          &amp; News</a></div>
      <div class="pages-nav__item pages-nav__item--small"><a class="link link--page link--faded"
          href="#page-contact">Contact</a></div>
      <div class="pages-nav__item pages-nav__item--social">
        <a class="link link--social link--faded" href="#"><i class="fa fa-twitter"></i><span
            class="text-hidden">Twitter</span></a>
        <a class="link link--social link--faded" href="#"><i class="fa fa-linkedin"></i><span
            class="text-hidden">LinkedIn</span></a>
        <a class="link link--social link--faded" href="#"><i class="fa fa-facebook"></i><span
            class="text-hidden">Facebook</span></a>
        <a class="link link--social link--faded" href="#"><i class="fa fa-youtube-play"></i><span
            class="text-hidden">YouTube</span></a>
      </div>
    </nav>
    <!-- /navigation-->
    <!-- pages stack -->
    <div class="pages-stack">
      <!-- page -->
      <div class="page" id="page-home">
        <Home/>
      </div>
      <!-- /page -->
      <div class="page" id="page-docu">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Documentation</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "We cannot have peace among men whose hearts find delight in killing any living creature." &mdash; Rachel
            Carson
          </p>
        </header>
        <img class="poster" src="../../static/images/6.jpg" alt="img06" />
      </div>
      <div class="page" id="page-manuals">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Manuals</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "When you adopt a vegan diet we make a connection, you don't go back, it is not a diet, it is a lifestyle."
            &mdash; Freelee Frugivore
          </p>
        </header>
        <img class="poster" src="../../static/images/2.jpg" alt="img02" />
      </div>
      <div class="page" id="page-software">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Software &amp; Downloads</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "I decided to pick the diet that I thought would maximize my chances of long-term survival." &mdash; Al Gore
          </p>
        </header>
        <img class="poster" src="../../static/images/3.jpg" alt="img03" />
      </div>
      <div class="page" id="page-custom">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Customization &amp; Settings</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "You have to make a conscious decision to change for your own well-being, that of your family and your
            country." &mdash;Bill Clinton
          </p>
        </header>
        <img class="poster" src="../../static/images/4.jpg" alt="img04" />
      </div>
      <div class="page" id="page-training">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Training &amp; Learning Center</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "The moment I began to understand what was going on with the treatment of animals, it led me more and more
            in the way of the path I am [on] now, which is a complete vegan." &mdash; Bryan Adams
          </p>
        </header>
        <img class="poster" src="../../static/images/5.jpg" alt="img05" />
      </div>
      <div class="page" id="page-buy">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Where to buy</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "When people ask me why I don't eat meat or any other animal products, I say, 'Because they are unhealthy
            and they are the product of a violent and inhumane industry.'" &mdash;
          </p>
        </header>
        <img class="poster" src="../../static/images/6.jpg" alt="img06" />
      </div>
      <div class="page" id="page-blog">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Blog &amp; News</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "The question is not, 'Can they reason?' nor, 'Can they talk?' but rather, 'Can they suffer?" &mdash; Jeremy
            Bentham
          </p>
        </header>
        <img class="poster" src="../../static/images/1.jpg" alt="img01" />
      </div>
      <div class="page" id="page-contact">
        <header class="bp-header cf">
          <h1 class="bp-header__title">Contact</h1>
          <p class="bp-header__desc">Based on Ilya Kostin's Dribbble shot <a
              href="https://dribbble.com/shots/2286042-Stacked-navigation">Stacked navigation</a></p>
          <p class="info">
            "Man is the only animal that can remain on friendly terms with the victims he intends to eat until he eats
            them." &mdash; Samuel Butler
          </p>
        </header>
        <img class="poster" src="../../static/images/4.jpg" alt="img04" />
      </div>
    </div>
    <!-- /pages-stack -->
    <button class="menu-button"><span>Menu</span></button>
  </div>
</template>
<script>
  import '@/assets/js/classie.js';
  import Home from '@/components/Home.vue';
  export default {
    components:{
      Home
    },
    mounted() {
      /**
       * main.js
       * http://www.codrops.com
       *
       * Licensed under the MIT license.
       * http://www.opensource.org/licenses/mit-license.php
       *
       * Copyright 2015, Codrops
       * http://www.codrops.com
       */
      // ;
      (function (window) {
        'use strict';

        var support = {
            transitions: Modernizr.csstransitions
          },
          // transition end event name
          transEndEventNames = {
            'WebkitTransition': 'webkitTransitionEnd',
            'MozTransition': 'transitionend',
            'OTransition': 'oTransitionEnd',
            'msTransition': 'MSTransitionEnd',
            'transition': 'transitionend'
          },
          transEndEventName = transEndEventNames[Modernizr.prefixed('transition')],
          onEndTransition = function (el, callback) {
            var onEndCallbackFn = function (ev) {
              if (support.transitions) {
                if (ev.target != this) return;
                this.removeEventListener(transEndEventName, onEndCallbackFn);
              }
              if (callback && typeof callback === 'function') {
                callback.call(this);
              }
            };
            if (support.transitions) {
              el.addEventListener(transEndEventName, onEndCallbackFn);
            } else {
              onEndCallbackFn();
            }
          },
          // the pages wrapper
          stack = document.querySelector('.pages-stack'),
          // the page elements
          pages = [].slice.call(stack.children),
          // total number of page elements
          pagesTotal = pages.length,
          // index of current page
          current = 0,
          // menu button
          menuCtrl = document.querySelector('button.menu-button'),
          // the navigation wrapper
          nav = document.querySelector('.pages-nav'),
          // the menu nav items
          navItems = [].slice.call(nav.querySelectorAll('.link--page')),
          // check if menu is open
          isMenuOpen = false;

        function init() {
          buildStack();
          initEvents();
        }

        function buildStack() {
          var stackPagesIdxs = getStackPagesIdxs();
          // set z-index, opacity, initial transforms to pages and add class page--inactive to all except the current one
          for (var i = 0; i < pagesTotal; ++i) {
            var page = pages[i],
              posIdx = stackPagesIdxs.indexOf(i);
            if (current !== i) {
              classie.add(page, 'page--inactive');

              if (posIdx !== -1) {
                // visible pages in the stack
                page.style.WebkitTransform = 'translate3d(0,100%,0)';
                page.style.transform = 'translate3d(0,100%,0)';
              } else {
                // invisible pages in the stack
                page.style.WebkitTransform = 'translate3d(0,75%,-300px)';
                page.style.transform = 'translate3d(0,75%,-3500px)';
              }
            } else {
              classie.remove(page, 'page--inactive');
            }

            page.style.zIndex = i < current ? parseInt(current - i) : parseInt(pagesTotal + current - i);

            if (posIdx !== -1) {
              page.style.opacity = parseFloat(1 - 0.1 * posIdx);
            } else {
              page.style.opacity = 0;
            }
          }
        }

        // event binding
        function initEvents() {
          // menu button click
          menuCtrl.addEventListener('click', toggleMenu);

          // navigation menu clicks
          navItems.forEach(function (item) {
            // which page to open?
            var pageid = item.getAttribute('href').slice(1);
            item.addEventListener('click', function (ev) {
              ev.preventDefault();
              openPage(pageid);
            });
          });

          // clicking on a page when the menu is open triggers the menu to close again and open the clicked page
          pages.forEach(function (page) {
            var pageid = page.getAttribute('id');
            page.addEventListener('click', function (ev) {
              if (isMenuOpen) {
                ev.preventDefault();
                openPage(pageid);
              }
            });
          });

          // keyboard navigation events
          document.addEventListener('keydown', function (ev) {
            if (!isMenuOpen) return;
            var keyCode = ev.keyCode || ev.which;
            if (keyCode === 27) {
              closeMenu();
            }
          });
        }

        // toggle menu fn
        function toggleMenu() {
          if (isMenuOpen) {
            closeMenu();
          } else {
            openMenu();
            isMenuOpen = true;
          }
        }

        // opens the menu
        function openMenu() {
          // toggle the menu button
          classie.add(menuCtrl, 'menu-button--open')
          // stack gets the class "pages-stack--open" to add the transitions
          classie.add(stack, 'pages-stack--open');
          // reveal the menu
          classie.add(nav, 'pages-nav--open');

          // now set the page transforms
          var stackPagesIdxs = getStackPagesIdxs();
          for (var i = 0, len = stackPagesIdxs.length; i < len; ++i) {
            var page = pages[stackPagesIdxs[i]];
            page.style.WebkitTransform = 'translate3d(0, 75%, ' + parseInt(-1 * 200 - 50 * i) +
              'px)'; // -500px, -230px, -260px
            page.style.transform = 'translate3d(0, 75%, ' + parseInt(-1 * 200 - 50 * i) + 'px)';
          }
        }

        // closes the menu
        function closeMenu() {
          // same as opening the current page again
          openPage();
        }

        // opens a page
        function openPage(id) {
          var futurePage = id ? document.getElementById(id) : pages[current],
            futureCurrent = pages.indexOf(futurePage),
            stackPagesIdxs = getStackPagesIdxs(futureCurrent);

          // set transforms for the new current page
          futurePage.style.WebkitTransform = 'translate3d(0, 0, 0)';
          futurePage.style.transform = 'translate3d(0, 0, 0)';
          futurePage.style.opacity = 1;

          // set transforms for the other items in the stack
          for (var i = 0, len = stackPagesIdxs.length; i < len; ++i) {
            var page = pages[stackPagesIdxs[i]];
            page.style.WebkitTransform = 'translate3d(0,100%,0)';
            page.style.transform = 'translate3d(0,100%,0)';
          }

          // set current
          if (id) {
            current = futureCurrent;
          }

          // close menu..
          classie.remove(menuCtrl, 'menu-button--open');
          classie.remove(nav, 'pages-nav--open');
          onEndTransition(futurePage, function () {
            classie.remove(stack, 'pages-stack--open');
            // reorganize stack
            buildStack();
            isMenuOpen = false;
          });
        }

        // gets the current stack pages indexes. If any of them is the excludePage then this one is not part of the returned array
        function getStackPagesIdxs(excludePageIdx) {
          var nextStackPageIdx = current + 1 < pagesTotal ? current + 1 : 0,
            nextStackPageIdx_2 = current + 2 < pagesTotal ? current + 2 : 1,
            idxs = [],

            excludeIdx = excludePageIdx || -1;

          if (excludePageIdx != current) {
            idxs.push(current);
          }
          if (excludePageIdx != nextStackPageIdx) {
            idxs.push(nextStackPageIdx);
          }
          if (excludePageIdx != nextStackPageIdx_2) {
            idxs.push(nextStackPageIdx_2);
          }

          return idxs;
        }

        init();

        //changes to a page such as id="page-manuals" without opening the menu and preserving menu transition functionality
        window.openPageNoTransition = function (id) {

          var futurePage = id ? document.getElementById(id) : pages[current],
            futureCurrent = pages.indexOf(futurePage),
            stackPagesIdxs = getStackPagesIdxs(futureCurrent);

          // set transforms for the new current page
          futurePage.style.WebkitTransform = 'translate3d(0, 0, 0)';
          futurePage.style.transform = 'translate3d(0, 0, 0)';
          futurePage.style.opacity = 1;

          classie.remove(futurePage, 'page--inactive');

          // set current
          if (id) {
            current = futureCurrent;
          }

          buildStack();
        }
      })(window);
    }
  }

</script>
<style>
  /* Made with http://icomoon.io/ */

  /* Resets */

  *,
  *:after,
  *:before {
    box-sizing: border-box;
  }


  /* Helper classes */

  .cf:before,
  .cf:after {
    content: ' ';
    display: table;
  }

  .cf:after {
    clear: both;
  }


  /* Main styles */

  body {
    margin: 0;
    color: #cecece;
    background: #1d1e21;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
  }

  a {
    text-decoration: none;
    color: #5c5edc;
    outline: none;
  }

  a:hover {
    color: #fff;
  }


  /* Blueprint header */

  .bp-header {
    padding: 6em 10vw 2em;
  }

  .bp-header__title {
    font-size: 2.125em;
    font-weight: 700;
    line-height: 1.3;
    margin: 0;
    letter-spacing: 2px;
    text-transform: uppercase;
    color: #fff;
  }

  .bp-header__desc {
    font-size: 0.95em;
    margin: 0.5em 0 1em;
    padding: 0;
  }

  .bp-header__present {
    font-size: 0.85em;
    font-weight: 700;
    position: relative;
    z-index: 100;
    display: block;
    padding: 0 0 0.6em 0.1em;
    letter-spacing: 0.5em;
    text-transform: uppercase;
    color: #5c5edc;
  }

  .bp-tooltip:after {
    font-size: 50%;
    font-size: 75%;
    position: relative;
    top: -8px;
    left: -12px;
    width: 30px;
    height: 30px;
  }

  .bp-tooltip:hover:before {
    content: attr(data-content);
    font-size: 110%;
    font-weight: 700;
    line-height: 1.2;
    position: absolute;
    left: auto;
    margin-left: 4px;
    padding: 0.8em 1em;
    text-align: left;
    text-indent: 0;
    letter-spacing: 0;
    text-transform: none;
    color: #fff;
    background: #5c5edc;
  }

  .bp-nav {
    margin: 0 0 0 -0.75em;
  }

  .bp-nav__item {
    position: relative;
    display: inline-block;
    width: 2.5em;
    height: 2.5em;
    margin: 0 0.1em;
    text-align: left;
    border-radius: 50%;
  }

  .bp-nav__item>span {
    display: none;
  }

  .bp-nav__item:hover:before {
    content: attr(data-info);
    font-size: 0.85em;
    font-weight: bold;
    position: absolute;
    top: 120%;
    left: 0;
    width: 600%;
    text-align: left;
    pointer-events: none;
    color: #595a5f;
  }

  .bp-nav__item:hover {
    background: #5c5edc;
  }

  .bp-icon:after {
    font-family: 'bpicons';
    font-weight: normal;
    font-style: normal;
    font-variant: normal;
    text-align: center;
    text-transform: none;
    color: #5c5edc;
    -webkit-font-smoothing: antialiased;
    speak: none;
  }

  .bp-nav .bp-icon:after {
    line-height: 2.4;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    text-indent: 0;
  }

  .bp-nav a:hover:after {
    color: #fff;
  }

  .bp-icon--next:after {
    content: '\e000';
  }

  .bp-icon--drop:after {
    content: '\e001';
  }

  .bp-icon--archive:after {
    content: '\e002';
  }

  .bp-icon--about:after {
    content: '\e003';
  }

  .bp-icon--prev:after {
    content: '\e004';
  }

  @media screen and (max-width: 40em) {
    .bp-header {
      padding: 50px 20px 1em;
    }

    .bp-header__title {
      font-size: 1.8em;
    }
  }

  html.js,
  .js body {
    overflow: hidden;
    height: 100vh;
  }

  /* Pages nav */

  .pages-nav {
    display: -webkit-flex;
    display: flex;
    -webkit-flex-wrap: wrap;
    flex-wrap: wrap;
    -webkit-justify-content: center;
    justify-content: center;
    -webkit-align-items: center;
    align-items: center;
    padding: 20px;
    text-align: center;
    background: #0e0f0f;
  }

  .js .pages-nav {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 50vh;
    padding: 30px;
    pointer-events: none;
    opacity: 0;
    background: transparent;
    -webkit-transition: -webkit-transform 1.2s, opacity 1.2s;
    transition: transform 1.2s, opacity 1.2s;
    -webkit-transition-timing-function: cubic-bezier(0.2, 1, 0.3, 1);
    transition-timing-function: cubic-bezier(0.2, 1, 0.3, 1);
    -webkit-transform: translate3d(0, 150px, 0);
    transform: translate3d(0, 150px, 0);
  }

  .js .pages-nav--open {
    pointer-events: auto;
    opacity: 1;
    -webkit-transform: translate3d(0, 0, 0);
    transform: translate3d(0, 0, 0);
  }

  .pages-nav__item {
    width: 33%;
    padding: 1em;
  }

  .js .pages-nav__item {
    padding: 0 10%;
  }

  .pages-nav .pages-nav__item--social {
    width: 100%;
    opacity: 0;
    -webkit-transition: -webkit-transform 1.2s, opacity 1.2s;
    transition: transform 1.2s, opacity 1.2s;
    -webkit-transition-timing-function: cubic-bezier(0.2, 1, 0.3, 1);
    transition-timing-function: cubic-bezier(0.2, 1, 0.3, 1);
    -webkit-transform: translate3d(0, 20px, 0);
    transform: translate3d(0, 20px, 0);
  }

  .pages-nav--open .pages-nav__item--social {
    opacity: 1;
    -webkit-transition-delay: 0.35s;
    transition-delay: 0.35s;
    -webkit-transform: translate3d(0, 0, 0);
    transform: translate3d(0, 0, 0);
  }

  .link {
    font-size: 0.85em;
    font-weight: bold;
    position: relative;
    letter-spacing: 1px;
    text-transform: uppercase;
  }

  .link:hover,
  .link:focus {
    color: #fff;
  }

  .link--page {
    display: block;
    color: #cecece;
  }

  .link--page:not(.link--faded)::before {
    content: '';
    position: absolute;
    top: 100%;
    left: 50%;
    width: 30px;
    height: 2px;
    margin: 5px 0 0 -15px;
    background: #fff;
    -webkit-transition: -webkit-transform 0.3s;
    transition: transform 0.3s;
    -webkit-transform: scale3d(0, 1, 1);
    transform: scale3d(0, 1, 1);
  }

  .link--page:hover:before {
    -webkit-transform: scale3d(1, 1, 1);
    transform: scale3d(1, 1, 1);
  }

  .link--faded {
    color: #4f4f64;
  }

  .link--faded:hover,
  .link--faded:focus {
    color: #5c5edc;
  }

  .link--page.link--faded {
    font-size: 0.65em;
  }

  .link--social {
    font-size: 1.5em;
    margin: 0 0.75em;
  }

  .text-hidden {
    position: absolute;
    display: block;
    overflow: hidden;
    width: 0;
    height: 0;
    color: transparent;
  }

  /* Pages stack */

  .js .pages-stack {
    z-index: 100;
    pointer-events: none;
    -webkit-perspective: 1200px;
    perspective: 1200px;
    -webkit-perspective-origin: 50% -50%;
    perspective-origin: 50% -50%;
  }

  .js .page {
    position: relative;
    z-index: 5;
    overflow: hidden;
    width: 100%;
    height: 100vh;
    pointer-events: auto;
    background: #2a2b30;
    box-shadow: 0 -1px 10px rgba(0, 0, 0, 0.1);
  }

  .js .pages-stack--open .page {
    cursor: pointer;
    -webkit-transition: -webkit-transform 0.45s, opacity 0.45s;
    transition: transform 0.45s, opacity 0.45s;
    -webkit-transition-timing-function: cubic-bezier(0.6, 0, 0.4, 1);
    transition-timing-function: cubic-bezier(0.6, 0, 0.4, 1);
  }

  .js .page--inactive {
    position: absolute;
    z-index: 0;
    top: 0;
    opacity: 0;
  }

  /* page content */

  .info {
    font-size: 1.25em;
    max-width: 50%;
    margin-top: 1.5em;
  }

  .poster {
    position: absolute;
    bottom: 4vh;
    left: 60%;
    max-width: 100%;
    max-height: 80%;
  }

  /* Menu button */

  .menu-button {
    position: absolute;
    z-index: 1000;
    top: 30px;
    left: 30px;
    width: 30px;
    height: 24px;
    padding: 0;
    cursor: pointer;
    border: none;
    outline: none;
    background: transparent;
  }

  .no-js .menu-button {
    display: none;
  }

  .menu-button::before,
  .menu-button::after,
  .menu-button span {
    background: #5f656f;
  }

  .menu-button::before,
  .menu-button::after {
    content: '';
    position: absolute;
    top: 50%;
    left: 0;
    width: 100%;
    height: 2px;
    pointer-events: none;
    -webkit-transition: -webkit-transform 0.25s;
    transition: transform 0.25s;
    -webkit-transform-origin: 50% 50%;
    transform-origin: 50% 50%;
  }

  .menu-button span {
    position: absolute;
    left: 0;
    overflow: hidden;
    width: 100%;
    height: 2px;
    text-indent: 200%;
    -webkit-transition: opacity 0.25s;
    transition: opacity 0.25s;
  }

  .menu-button::before {
    -webkit-transform: translate3d(0, -10px, 0) scale3d(0.8, 1, 1);
    transform: translate3d(0, -10px, 0) scale3d(0.8, 1, 1);
  }

  .menu-button::after {
    -webkit-transform: translate3d(0, 10px, 0) scale3d(0.8, 1, 1);
    transform: translate3d(0, 10px, 0) scale3d(0.8, 1, 1);
  }

  .menu-button--open span {
    opacity: 0;
  }

  .menu-button--open::before {
    -webkit-transform: rotate3d(0, 0, 1, 45deg);
    transform: rotate3d(0, 0, 1, 45deg);
  }

  .menu-button--open::after {
    -webkit-transform: rotate3d(0, 0, 1, -45deg);
    transform: rotate3d(0, 0, 1, -45deg);
  }

  @media screen and (max-width: 60em) {
    .info {
      max-width: 100%;
    }

    .poster {
      position: relative;
      top: auto;
      left: auto;
      display: block;
      max-width: 100%;
      max-height: 50vh;
      margin: 0 0 0 50%;
    }

    .pages-nav__item {
      width: 50%;
      min-height: 20px;
    }

    .link--page {
      overflow: hidden;
      white-space: nowrap;
      text-overflow: ellipsis;
    }

    .link--social {
      margin: 0 0.1em;
    }
  }

  @media screen and (max-width: 40em) {
    .js .pages-nav {
      display: block;
      padding: 10px 20px 0 20px;
      text-align: left;
    }

    .js .pages-nav__item {
      width: 100%;
      padding: 4px 0;
    }

    .js .pages-nav__item--small {
      display: inline-block;
      width: auto;
      margin-right: 5px;
    }

    .pages-nav__item--social {
      font-size: 0.9em;
    }

    .menu-button {
      top: 15px;
      right: 10px;
      left: auto;
    }

    .info {
      font-size: 0.85em;
    }

    .poster {
      margin: 1em;
    }
  }

</style>
