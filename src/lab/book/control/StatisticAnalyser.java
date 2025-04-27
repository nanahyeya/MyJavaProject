package lab.book.control;
import java.util.Map;

import lab.book.entity.Publication;

import java.util.HashMap;
import java.util.List;

public class StatisticAnalyser {
    public Map<String, Double> calculateAveragePriceByType(List<Publication> pubs) {
        Map<String, Double> result = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        Map<String, Integer> sum = new HashMap<>();

        for (Publication pub : pubs) {
            String type = pub.getClass().getSimpleName();
            count.put(type, count.getOrDefault(type, 0) + 1);
            sum.put(type, sum.getOrDefault(type, 0) + pub.getPrice());
        }

        for (String type : count.keySet()) {
            result.put(type, (double)sum.get(type) / count.get(type));
        }

        return result;
    }

    public Map<String, Double> calculatePublicationDistribution(List<Publication> pubs) {
        Map<String, Double> result = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (Publication pub : pubs) {
            String type = pub.getClass().getSimpleName();
            count.put(type, count.getOrDefault(type, 0) + 1);
        }

        int total = pubs.size();
        for (String type : count.keySet()) {
            result.put(type, (count.get(type) * 100.0) / total);
        }

        return result;
    }

    public double calculate2007PublicationRatio(List<Publication> pubs) {
        long count = pubs.stream()
                        .filter(p -> p.getPublishDate().startsWith("2007"))
                        .count();
        return (count * 100.0) / pubs.size();
    }

    public void printStatistics(List<Publication> pubs) {
        System.out.println("===== ���ǹ� ��� �м� =====");
        
        // 1. Average price by type
        System.out.println("1. Ÿ�Ժ� ��� ����:");
        Map<String, Double> avgPrices = calculateAveragePriceByType(pubs);
        avgPrices.forEach((type, avg) -> 
            System.out.printf("   - %s: %,.0f��\n", type, avg));
        
        // 2. Publication distribution
        System.out.println("\n2. ���ǹ� ���� ����:");
        Map<String, Double> distribution = calculatePublicationDistribution(pubs);
        distribution.forEach((type, percent) -> 
            System.out.printf("   - %s: %.2f%%\n", type, percent));
        
        // 3. 2007 publication ratio
        System.out.printf("\n3. 2007�⿡ ���ǵ� ���ǹ� ����: %.2f%%\n", 
                         calculate2007PublicationRatio(pubs));
        System.out.println("=============================");
    }
}