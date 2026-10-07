package JavaBasics;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseOrder {

	public static void main(String[] args) {
		String str="Selenium automation testing";
		String[] words=str.split(" ");
		for (int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+ " ");
		}

	}

}
