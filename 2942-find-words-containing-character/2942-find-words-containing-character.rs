impl Solution {
    pub fn find_words_containing(words: Vec<String>, x: char) -> Vec<i32> {
        let mut output = Vec::new();
        for i in 0..words.len() {
            match words[i].find(x) {
                Some(_index) => output.push(i.try_into().unwrap()),
                None => continue,
            }
        }
        output
    }
}