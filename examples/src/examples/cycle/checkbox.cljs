(ns examples.cycle.checkbox
  (:require [help.core :as help]
            [help.unit :as unit]
            [frp.clojure.core :as core]
            [frp.core :as frp]))

(def check
  (frp/event))

(def checked
  (->> check
       core/count
       (help/<$> odd?)
       (frp/stepper false)))

(defn checkbox-component
  [checked*]
  [:div
   [:input {:on-change #(check unit/unit)
            :type      "checkbox"}]
   "Toggle me"
   [:p (if checked*
         "ON"
         "off")]])

(def checkbox
  (help/<$> checkbox-component checked))
