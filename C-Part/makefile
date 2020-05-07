all:fsanitize gcc


fsanitize:Ex1.c
	gcc -fsanitize=leak -fsanitize=signed-integer-overflow -fsanitize=bounds -fsanitize=shift Ex1.c -o fsanitize

gcc:Ex1.c
	gcc Ex1.c -o gcc

clean:
	rm -f gcc fsanitize