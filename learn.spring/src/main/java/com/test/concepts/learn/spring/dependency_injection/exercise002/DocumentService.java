package com.test.concepts.learn.spring.dependency_injection.exercise002;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 21.0.0 2024-07-16
 */
public interface DocumentService {

    String generatePdfDocument();

    String generatePdfBase64Document();

    String generateExcelDocument();

    String generateExcelBase64Document();

    String generateCsvDocument();

    String generateCsvBase64Document();
}
