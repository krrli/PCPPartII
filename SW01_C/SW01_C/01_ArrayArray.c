#include <stdio.h>


/*
	typischer imperativen C-Code mit einer goto - Anweisung
	0 1 2 3 4 5 6 7 = printNumbersGoto(7)
*/
void printNumbersGoto(int untilNumberX) {		

	if (untilNumberX < 0) return;	

	int i = 0;
	iPlusPlusAndContinue:
	printf("%i ", i);
	i++;
	if (i <= untilNumberX) goto iPlusPlusAndContinue;

	printf("= printNumbersGoto(%i)\n ", untilNumberX);

}

/*
	typischer strukturierten C-Code mit einer for-Anweisung
*/
void printNumbersFor(int untilNumberX) {

}

/*
	typischer prozeduraler Code mit einer rekursiven Funktion
*/
void printNumbersRecursiveFunction() {

}

int main() {
	printNumbersGoto(7);

	return 0;
}

