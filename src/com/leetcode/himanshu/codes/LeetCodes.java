package com.leetcode.himanshu.codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class LeetCodes {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static void preO(TreeNode root){
        if(root==null)return;
        preO(root.left);
        System.out.println(root.val);
        preO(root.right);
    }

    public static void levelOrderBottomHelper(TreeNode root,int level,List<List<Integer>>ans){
        if(root==null)return;
        if(ans.get(level-1)==null){
            ans.add(level-1,new ArrayList<>());
            ans.get(level-1).add(root.val);
            levelOrderBottomHelper(root.left,level+1,ans);
            levelOrderBottomHelper(root.right,level+1,ans);
        }
        else{
            ans.get(level-1).add(root.val);
            levelOrderBottomHelper(root.left,level+1,ans);
            levelOrderBottomHelper(root.right,level+1,ans);
        }
    }

    public static int findLevels(TreeNode root){
        if(root==null)return 0;
        return Math.max(1+findLevels(root.left),1+findLevels(root.right));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> revans = new ArrayList<>();
        int levels = findLevels(root);
        for(int i=0;i<levels;i++){
            ans.add(new ArrayList<>());
        }
        levelOrderBottomHelper(root,1,ans);
        for (int i = 0; i <levels ; i++) {
            revans.add(0,ans.get(i));
        }
        return revans;
    }

    public static void func(List<List<Integer>>list,int n){
        list.get(0).add(1);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.get(i).add(j,1);
                }
                else{
                    list.get(i).add(j,list.get(i-1).get(j)+
                            list.get(i-1).get(j-1));
                }
            }
        }
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer>list = new ArrayList<>();
        int c=1;
        if(rowIndex==0){
            list.add(c);
        }
        else{
            list.add(c);
            for(Integer i=1;i<=rowIndex;i++){
                c=(int)(((long)(rowIndex-i+1)*c)/i);
                list.add(c);
            }
        }
        return list;
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        int[] min = new int[prices.length];
        int[] max = new int[prices.length];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minVal){
                minVal=prices[i];
                min[i]=minVal;
            }
            else{
                min[i]=minVal;
            }
        }
//        System.out.println(Arrays.toString(min));
        for(int i=prices.length-1;i>=0;i--){
            if(prices[i]>maxVal){
                maxVal=prices[i];
                max[i]=maxVal;
            }
            else{
                max[i]=maxVal;
            }
        }
//        System.out.println(Arrays.toString(max));
        for(int i=0;i<prices.length;i++){
            max[i]=max[i]-min[i];
            if(max[i]>ans)
                ans=max[i];
        }
//        System.out.println(Arrays.toString(max));
        return ans;
    }

    public int maxProfit2(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&& s.charAt(i)<='z') || (s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9))
                sb.append(s.charAt(i));
        }
        String s1= sb.toString();
        String s2= sb.reverse().toString();
        System.out.println(s1);
        System.out.println(s2);
        return s1.equals(s2);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int sum = 0;
        int i=0,j=numbers.length-1;
        while(i<j){
            sum=(numbers[i]+numbers[j]);
            if(sum==target){
                ans[0]=i;
                ans[1]=j;
                break;
            }
            if(sum>target)j--;
            else i++;
        }
        return ans;
    }

    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry entry:map.entrySet()){
            if((int)entry.getValue()>(nums.length/2)){
                return (int)entry.getKey();
            }
        }
        return -1;
    }

    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            sb.append((char)('A'+(n%26)));
            n/=26;
        }
        return sb.reverse().toString();
    }

    public static int titleToNumber(String s) {
        int sum=0;
        char ch  = s.charAt(s.length()-1);
        System.out.println(ch);
        sum += (ch-'A'+1);
        if(s.length()>1){
            sum+=(26*(s.length()-1));
        }
        return sum;
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result<<=1;
            result+=(n&1);
            n>>=1;
        }
        return result;
    }

    public int[] countBits(int num) {
        int[] arr = new int[num+1];
        arr[0]=0;
        for(int i=1;i<=num;i++){
            arr[i]=arr[i/2]+(i%2);
        }
        return arr;
    }

    public boolean isAnagram(String s, String t) {
        char[] sarr=s.toCharArray();
        Arrays.sort(sarr);
        char[] tarr=s.toCharArray();
        Arrays.sort(tarr);
        String st = sarr.toString();
        String tt = tarr.toString();
        System.out.println(st);
        System.out.println(tt);
        return sarr.toString().equals(tarr.toString());
    }


    public  static int solution(int[] arr,int[] memo, int i, int size){
        if(i>=size)return 0;
        if(memo[i]>=0)return memo[i];
        int result = Math.max(arr[i]+solution(arr,memo,i+2,size), solution(arr,memo,i+1,size));
        memo[i]=result;
        return result;
    }

    public static int trailingZeroes(int n) {
        if(n==0)return 0;
        return (n/5)+trailingZeroes(n/5);
    }

    public static int countPrimes(int n) {
        boolean sieve[] = new boolean[100005];
        Arrays.fill(sieve,true);
        sieve[0]=sieve[1]=false;
        for(int i=2;i<100005;i++){
            for(int j=2;i*j<100005;j++){
                sieve[i*j]=false;
            }
        }

        int count=0;
        for(int i=1;i<=n;i++){
            if(sieve[i]==true)count++;
        }
        return count;
    }

    public static boolean isUgly(int num) {
        for(int i=2;i<6;i++){
            while(num%i==0)num/=i;
        }
        return num==1;
    }



    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        return !(set.size()==nums.length);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ans = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]==nums[j] && ((i-j)==k)){
                        ans=true;
                        break;
                    }
                }
                if(ans==true){
                    break;
                }
            }
        }
        return ans;
    }

    public static String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static boolean isPowerOfTwo(int n) {
       if(n<=0)return false;
       return ((n&(n-1))==0);
    }


    static int MAX = 32;
    static int findX(int A, int B)
    {
        int X = 0;
        for (int bit = 0; bit < MAX; bit++)
        {
            int tempBit = 1 << bit;
            int bitOfX = A & B & tempBit;
            X += bitOfX;
        }
        return X;
    }

    public static boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        for(Integer i=0;i<s.length();i++){
            if(map.put(s.charAt(i),i)!=map.put(t.charAt(i)+"",i))
                return false;
        }
        return true;
    }

    static int count=0;

    public static boolean checkPalindrome(String str, int s, int e){
        if(s>e)return false;
        if(s==e)return true;
        if(str.charAt(s)!=str.charAt(e)){
            count++;
            return checkPalindrome(str, ++s, e) || checkPalindrome(str,s,--e);
        }
        return checkPalindrome(str, ++s, --e);
    }

    public static String[] func(){
        String str = "b,d,d,b";
        return str.split(",");
    }

    static int[] memo;
    public static int climbStairsHelper(int n) {
        if(n<0)return 0;
        if(n==0)return 1;
        if(memo[n]>0)return memo[n];
        int result = climbStairsHelper(n-1)+climbStairsHelper(n-2);
        memo[n]=result;
        return result;
    }

    public static int climbStairs(int n) {
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        return climbStairsHelper(n-1)+climbStairsHelper(n-2);
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }

        for(int i=0;i<magazine.length();i++){
            map1.put(magazine.charAt(i),map1.getOrDefault(magazine.charAt(i),0)+1);
        }

        boolean flag=true;
        for(Map.Entry entry : map1.entrySet()){
            if(!map2.containsKey(entry.getKey())){
                flag=false;
                break;
            }
            if((Integer)entry.getValue()<=map2.get(entry.getKey())){
                flag=false;
                break;
            }
        }
        return flag;
    }

    public static String getHint(String secret, String guess) {
        int bull=0;
        int cow=guess.length();
        boolean[] check = new boolean[secret.length()];
        Arrays.fill(check,false);
        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
                cow--;
                check[i]=true;
            }
        }
        for(int i=0;i<guess.length();i++){
            if(secret.contains(guess.charAt(i)+"")==false){
                cow--;
            }
        }
        return bull+"A"+cow+"B";
    }

    public static char findTheDifference(String s, String t) {
        char ans = 0;
        for(char ch:s.toCharArray()){
            ans^=ch;
        }
        for(char ch:t.toCharArray()){
            ans^=ch;
        }
        return ans;
    }

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')return true;
        return false;
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int f = 0;
        int l = s.length()-1;

        while(f<l){
            while(!isVowel(arr[f]) && f<l)f++;
            while(!isVowel(arr[l]) && l>f)l--;
            char temp=arr[f];
            arr[f]=arr[l];
            arr[l]=temp;
            f++;l--;
        }

        return new String(arr );
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        Set<Integer> ans = new HashSet();
        for(Integer i : set1){
            if(set2.contains(i)){
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }

    public static int maxPower(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end=0;
        int ans = Integer.MIN_VALUE;
        while(end<arr.length){
            if(arr[start]==arr[end]){
                count++;
                end++;
            }
            else{
                ans=Math.max(ans,end-start);
                start=end;
            }
        }
        ans=Math.max(ans,end-start);
//        System.out.println(ans);
        return ans;
    }

    public String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<>();
        for(List i:paths){
            map.put((String)i.get(0),(String)i.get(1));
        }
        System.out.println(map);
        String ans="";
        for(Map.Entry<String,String> entry: map.entrySet()){
            if(!map.keySet().contains(entry.getValue())){
                ans=entry.getValue();
            }
        }
        return ans;
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails){
            int loc = email.indexOf('@');
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<email.length();i++){
                if(i<=loc){
                    if(email.charAt(i)=='.')continue;
                    if(email.charAt(i)=='+'){
                        while(email.charAt(i)!='@')i++;
                    }
                }
                sb.append(email.charAt(i));
            }
            System.out.println(sb);
            set.add(new String(sb));
        }
        System.out.println(set);
        return set.size();
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int diff=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    diff=Math.min(diff,Math.abs(arr[i]-arr[j]));
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i!=j){
                    if(Math.abs(arr[i]-arr[j])==diff){
                        List<Integer>list = new ArrayList<>();
                        if(arr[i]>arr[j]){
                            list.add(arr[j]);
                            list.add(arr[i]);
                        }
                        else{
                            list.add(arr[i]);
                            list.add(arr[j]);
                        }
                        ans.add(list);
                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27});
    }
}
