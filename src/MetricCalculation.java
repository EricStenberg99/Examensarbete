import java.util.ArrayList;

public class MetricCalculation {

    public double Latency(double packetSize, double protocolOverhead, double linkBandwidth, double capsulatingTime) {
        double latency = ((packetSize+protocolOverhead)/linkBandwidth) + capsulatingTime;
        return latency;
    }
    public double Throughput(double totalDataTransferred, double totalTimeTaken) {
        double throughput = totalDataTransferred/totalTimeTaken;
        return throughput;
    }

    public double findMaxLatency(ArrayList<Double> latencies) {
        double maxLatency = 0;
        for (Double latency : latencies) {
            if (latency > maxLatency) {
                maxLatency = latency;
            }
        }
        return maxLatency;
    }

    public double finMinLatency(ArrayList<Double> latencies) {
        double minLatency = 1000000;
        for(Double latency : latencies) {
            if (latency < minLatency) {
                minLatency = latency;
            }
        }
        return minLatency;
    }

    public double Jitter(double maxLatency, double minLatency) {
        double jitter = maxLatency - minLatency;
        return jitter;
    }

}
