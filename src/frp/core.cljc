(ns ^:figwheel-always frp.core
  (:refer-clojure :exclude [stepper time transduce])
  (:require [frp.derived :as derived :include-macros true]
            [frp.io :as io]
            [frp.primitives.behavior :as behavior :include-macros true]
            [frp.primitives.event :as event]
    #?(:cljs [frp.location])))

(def restart
  behavior/restart)

(def event
  derived/event)

(def behavior
  derived/behavior)

(def time
  behavior/time)

(def stepper
  behavior/stepper)

(def time-transform
  behavior/time-transform)

(def transduce
  event/transduce)

(def snapshot
  event/snapshot)

(def activate
  event/activate)

(def on
  io/on)

(def combine
  derived/combine)

(defmacro transparent
  [expr]
  `(derived/transparent ~expr))

(def accum
  derived/accum)

(def buffer
  derived/buffer)

(def mean
  derived/mean)

(def switcher
  derived/switcher)

(restart)
