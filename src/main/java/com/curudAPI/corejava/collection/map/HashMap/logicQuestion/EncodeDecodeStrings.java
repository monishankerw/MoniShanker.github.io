package org.example.corejava.collection.map.HashMap.logicQuestion;


/*
Encode and Decode Strings
Design an algorithm to encode a list of strings to a string. The
encoded string is then sent over the network and decoded back to
the original list of strings.
implement encode and decode
Input: [“lint”
,
“code”
,
“love”
,
“you”]
Output: [“lint”
,
“code”
,
“love”
,
“you”]
Explanation: One possible encode method is: “lint:;code:;love:;you”
Input: [“we”
,
“say”
,
“:”
,
“yes”]
Output: [“we”
,
“say”
,
“:”
,
“yes”]
Explanation: One possible encode method is: “we:;say:;:::;yes”
 */

/*
Approach
Encoding:

Concatenate each string in the list with a delimiter between them. The delimiter should be a sequence of characters that is unlikely to appear in any of the strings, such as ":;".
Decoding:

Split the encoded string by the delimiter to retrieve the original list of strings.
 */
    import java.util.ArrayList;
import java.util.List;

    public class EncodeDecodeStrings {
        // Delimiter to separate the strings in the encoded format
        private static final String DELIMITER = ":;";

        public static void main(String[] args) {
            EncodeDecodeStrings eds = new EncodeDecodeStrings();
            List<String> input = List.of("lint", "code", "love", "you");
            String encoded = eds.encode(input);
            System.out.println("Encoded: " + encoded);

            List<String> decoded = eds.decode(encoded);
            System.out.println("Decoded: " + decoded);
        }

        // Encodes a list of strings into a single string
        public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for (String str : strs) {
                sb.append(str).append(DELIMITER);
            }
            return sb.toString();
        }

        // Decodes a single string back into a list of strings
        public List<String> decode(String s) {
            List<String> result = new ArrayList<>();
            int start = 0;
            int end;

            while ((end = s.indexOf(DELIMITER, start)) != -1) {
                result.add(s.substring(start, end));
                start = end + DELIMITER.length();
            }

            // Add the last segment (or handle the case where the string is empty)
            if (start < s.length()) {
                result.add(s.substring(start));
            }

            return result;
        }
    }


