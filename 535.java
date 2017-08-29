public class Codec {

    Map<Integer, String> map = new HashMap<Integer, String>();
    String prefix = "http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash = longUrl.hashCode();
        map.put(hash, longUrl);
        return prefix + hash;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace(prefix, "")));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));