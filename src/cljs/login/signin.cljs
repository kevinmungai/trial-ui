(ns login.signin)

(defn sign-in-panel
  []
  [:div.columns.is-mobile.is-centered>div.column.is-4-tablet.is-10-mobile
   [:div.card
    [:div {:style {:display "flex"
                   :justify-content "center"
                   :flex-direction "column"
                   ;;                           :max-width "40%"
                   }}
     [:div {:style {:align-self "center"}}
      [:h1.is-capitalized.has-text-weight-light.is-size-1.has-text-grey
       "login"]]
     [:div.field {:style {:padding 20
                          :flex-basis "20%"
                          :align-self "center"
                          ;;:max-width 300
                          }}
      [:label.label "email address"]
      [:div.control>input.input {:type "text"
                                 :placeholder "example@email.com"}]]
     [:div.field {:style {:padding 20
                          ;;             :max-width 350
                          :align-self "center"}}
      [:label.label "password"]
      [:div.control>input.input {:type "text"}]]
     [:div.buttons.is-right
      [:a.button.is-text
       [:p.is-size-7.has-text-info "FORGOT YOUR PASSWORD?"]]]
     [:div {:style {:align-self "center"
                    :padding 20}}
      [:a.button.is-info.is-rounded.is-medium
       [:p.is-size-4.is-uppercase.has-text-weight-normal "LOGIN"]]]]]])
