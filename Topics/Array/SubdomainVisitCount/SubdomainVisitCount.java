class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : cpdomains) {
            String[] parts = s.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];

            map.put(domain, map.getOrDefault(domain, 0) + count);

            int dot = domain.indexOf('.');
            while (dot != -1) {
                String subdomain = domain.substring(dot + 1);
                map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                dot = domain.indexOf('.', dot + 1);
            }
        }

        for (String domain : map.keySet()) {
            ans.add(map.get(domain) + " " + domain);
        }

        return ans;
    }
}