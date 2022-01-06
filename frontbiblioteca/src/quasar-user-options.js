import Vue from 'vue'

import 'quasar/dist/quasar.css'
import '@quasar/extras/roboto-font/roboto-font.css'
import '@quasar/extras/material-icons/material-icons.css'
import '@quasar/extras/fontawesome-v5/fontawesome-v5.css'
import {
  Quasar,
  QLayout,
  QHeader,
  QFooter,
  QMenu,
  QDrawer,
  QPageContainer,
  QPage,
  QToolbar,
  QToolbarTitle,
  QBtn,
  QIcon,
  QList,
  QItem,
  QItemSection,
  QItemLabel,
  QInput,
  QSeparator,
  ClosePopup,
  QTable,
  QTh,
  QTr,
  QTd,
  QCard,
  QCardSection,
  QCardActions,
  QForm,
  QBreadcrumbs,
  QBreadcrumbsEl,
  QTooltip,
  QDialog,
  QAvatar,
  Notify,
  QExpansionItem,
  QCheckbox,
  QSpace,
  QSelect,
  QPopupProxy,
  QDate,
  Dialog,
  QBadge,
  Loading,
  QToggle,
  QBtnDropdown,
  QPageSticky,
  QMarkupTable,
  QChip,
  QPopupEdit,
  QField,
  QSpinnerGears,
  QRouteTab,
  QTabs,
  QTab,
  QTabPanels,
  QTabPanel,
  QStepper,
  QStep,
  QStepperNavigation,
  QScrollArea,
  QTimeline,
  QTimelineEntry,
  LoadingBar,
  QSplitter,
  QSlideItem,
  QBar,
  Ripple
} from 'quasar'
Vue.use(Quasar, {
  components: {
    QLayout,
    QHeader,
    QFooter,
    QMenu,
    QDrawer,
    QPageContainer,
    QPage,
    QToolbar,
    QToolbarTitle,
    QBtn,
    QIcon,
    QList,
    QItem,
    QItemSection,
    QItemLabel,
    QInput,
    QSeparator,
    QTable,
    QTh,
    QTr,
    QTd,
    QCard,
    QCardSection,
    QCardActions,
    QForm,
    QBreadcrumbs,
    QBreadcrumbsEl,
    QTooltip,
    QDialog,
    QAvatar,
    QExpansionItem,
    QCheckbox,
    QSpace,
    QPopupProxy,
    QDate,
    QSelect,
    QBadge,
    QToggle,
    QBtnDropdown,
    QPageSticky,
    QMarkupTable,
    QChip,
    QPopupEdit,
    QField,
    QRouteTab,
    QTabs,
    QTab,
    QTabPanels,
    QTabPanel,
    QStepper,
    QStep,
    QStepperNavigation,
    QScrollArea,
    QTimeline,
    QTimelineEntry,
    QSplitter,
    QSlideItem,
    QBar,
    Loading
  },
  directives: {
    ClosePopup,
    Ripple
  },
  plugins: {
    Dialog,
    QDialog,
    Notify,
    Loading,
    QSpinnerGears,
    LoadingBar
  },
  config: {
    notify: {
      position: 'top',
      timeout: 2500
    },
    loading: { /* Loading defaults */ }
  }
})
Notify.setDefaults({
  position: 'top',
  timeout: 2500
})
Loading.setDefaults({
  message: '<strong>Carregando...</strong><br/><span class="text-accent"><strong>Aguarde</strong></span>',
  spinner: QSpinnerGears,
  spinnerColor: 'primary'

})
LoadingBar.setDefaults({
  color: 'primary',
  size: '10px',
  position: 'top'
})
