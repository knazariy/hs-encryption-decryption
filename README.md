# Encryption-Decryption
This is a Hyperskill Encryption Decryption project source code.
<hr/>

### How to:
Run the program using a CLI. Examples:

```java Main -mode enc -in input.txt -out output.txt -key 5 -alg unicode```

Or

```java Main -mode enc -data "Ave, Caesar, morituri te salutant" -key 5```
<hr/>

### Parameters:
- `-mode [enc|dec]` ('Encryption' by default): Sets the mode to Encryption/Decryption
- `-key [0-n]` (0 by default): Shifts each symbol by specified key
- `-data [string]` (empty by default): Data to be encrypted
- `-in [path_to_file]` (optional): Input file with data
- `-out [path_to_file]` (optional): Ouptut file for data
- `-alg [shift|unicode]` ('Shift' by default): ```Shift``` mode guarantees that the output is alphabetical, whereas ```Unicode``` mode does not.
