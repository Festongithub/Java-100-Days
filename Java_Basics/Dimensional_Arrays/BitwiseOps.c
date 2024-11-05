#include <stdio.h>
/**
 * main - run the main code
 *
 * Return: Always zero
 **/

int main(void)
{
	int a = 15;
	int b = 2;
	int i = b >> a;
	int j = b << a;

	printf("Left shift is: [%d]\n", i);
	printf("Right shift is : [%d]\n", j);

	return (99);
}
