;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-reader.ss" "lang")((modname Uebung_Woche6) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
; --------------- Aufgabe 1  ---------------

(define couple (list
(cons "Adam" (cons "Eva" empty))
(cons "Paul" (cons "Paula" empty))))


(define spec-list(list 1(list 2 3(list 5 7)9)))

(define coupleList(list (list "Adam" "Eva")(list "Paul" "Paula")))

; a) (rest (first couple)) = (list ("Eva"))
;    (first (rest couple)) = (list "Paul" "Paula"
;    (rest (rest couple)) = Leere Liste
;    (first (first (rest couple))) = "Paul"
;    (rest (first (rest couple))) = (list "Paula")
;    (cons? (rest (rest couple))) = #false Weil leere Liste
;
; b) (first (rest (first (rest (rest (first (rest spec-list)))))))


; --------------- Aufgabe 2  ---------------
(define (redouble a-list)
  (cond ((empty? a-list) empty)
  (else
   (cons (* 2 (first a-list))
        (redouble (rest a-list))))
))

(define (redouble-with-factor a-list factor)
  (cond ((empty? a-list) empty)
  (else
   (cons (* factor (first a-list))
        (redouble-with-factor (rest a-list) factor)))
))

;(redouble (list 1 2 3))
;(redouble-with-factor (list 1 2 3) 2)
;(redouble-with-factor (list 1 2 3) 5)

; --------------- Aufgabe 3 a) ---------------
(define (f liste)
  (if (empty? liste) empty             ;wenn liste leer ist, gib leer zurück
      (if (empty? (rest liste))(first liste)
                                       ;wenn rest der Liste leer ist, gib den ersten teil der liste zurück
       (f (rest liste))                ;sonst: rekursiver Aufruf mit dem Rest der Liste.
      )
  )
)
; ==> bewirkt, dass immer das letzte Element der Liste zurückgegeben wird

; --------------- Aufgabe 3 b) ---------------
(define (g liste)
  (cond ((empty? liste) empty)                    ;liste leer: gib leer zurück
        ((empty? (rest liste)) (first liste))     ;rest der liste leer: gib das erste Element der Liste zurück
        (else                                     ;sonst:
         (if (> (first liste) (g (rest liste)))   ;wenn der erste Teil der Liste > als (rekursiver Aufruf g mit Rest)
             (first liste)                        ;gib den 1. teil der liste zurück 
             (g (rest liste)))                    ;sonst nochmals rekursiver Aufruf mit dem Rest der Liste
         )
    ))
; ==> bewirkt, dass immer das grösste Element der Liste zurückgegeben wird
; (g (list 5 6 10 3 99))
; (g (list 5 6 10 3))
; (g (list 3000 5 3 2))

; --------------- Aufgabe 4 ---------------
(define (delete item a-list)
  (cond
    ((empty? a-list) empty) ;liste leer: leer zurück
    ((equal? item (first a-list)) (rest a-list)) ;item == erster Teil d. Liste? Rest d. Liste zurück
    (else
     (cons ;zusammenfügen: 
      (first a-list) ;erster Teil der Liste
      (delete item (rest a-list)) ;rekursiver Aufruf mit dem Rest der Liste
      )
     )  
  )
)

;(delete 5 (list 5 1 2 4))
;(delete 3 (list 1 2 3 4))
;(delete 'c '(a b c d))

; --------------- Aufgabe 5 ---------------