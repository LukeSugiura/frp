(ns repl
  (:require [com.rpl.specter :as s]
            [figwheel-sidecar.repl-api :as repl-api]
            [taoensso.encore :as encore]))

(def app-build
  {:id           "app"
   :source-paths ["src"]
   :compiler     {:output-to            "resources/public/js/main.js"
                  :output-dir           "resources/public/js/out"
                  :main                 "examples.core"
                  :asset-path           "/js/out"
                  :source-map-timestamp true
                  :preloads             ['devtools.preload]
                  :external-config      {:devtools/config {:features-to-install :all}}}
   :figwheel     true})

(repl-api/start-figwheel!
  {:build-ids  ["app"]
   :all-builds [app-build]})

(repl-api/cljs-repl "app")
