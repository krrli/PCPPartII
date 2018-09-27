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

	printf("= printNumbersGoto(%i)\n", untilNumberX);

}

/*
	typischer strukturierten C-Code mit einer for-Anweisung
*/
void printNumbersFor(int untilNumberX) {
	for (int i = 0; i <= untilNumberX; i++) {
		printf("%i ", i);
	}
	printf("= printNumbersFor(%i)\n ", untilNumberX);
}

/*
	typischer prozeduraler Code mit einer rekursiven Funktion
*/
void printNumbersRecursiveFunction(int untilNumberX, int actualNumber) {
	printf("%i ", actualNumber);
	if (actualNumber <= untilNumberX) printNumbersRecursiveFunction(untilNumberX, (actualNumber+1));
	else printf("= printNumbersRecursiveFunction(%i)\n ", untilNumberX);
}


int main() {
	//printNumbersGoto(7);
	//printNumbersFor(7);
	printNumbersRecursiveFunction(7, 0);
	return 0;
}

