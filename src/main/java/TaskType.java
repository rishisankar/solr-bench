import java.util.Map;

import org.apache.solr.benchmarks.beans.IndexBenchmark;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskType {
	@JsonProperty("command")
	String command;
	
	@JsonProperty("index-benchmark")
	IndexBenchmark indexBenchmark;

	@JsonProperty("defaults")
	Map<String, String> defaults;
}