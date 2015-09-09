(ns magadi.core
  (:gen-class)
    (:require [magadi.loaders :as l]))


(defn )

(defn -main [& args]
      (print "printing the load request")
      (print (l/load-request "transactionStatusQuery.xml")))