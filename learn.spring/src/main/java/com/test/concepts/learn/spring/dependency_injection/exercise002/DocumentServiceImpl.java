package com.test.concepts.learn.spring.dependency_injection.exercise002;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Learn Dependency Injection
 *
 * @author Alex T.H.
 * @version v0.1.1
 * @since 21.0.0 2024-07-16
 */
@Data
@NoArgsConstructor
@Component
public class DocumentServiceImpl implements DocumentService{

    @Override
    public String generatePdfDocument() {
        return "Generate PDF Document => [Status : "+Status.IN_PROGRESS+"]";
    }

    @Override
    public String generatePdfBase64Document() {
        return "Generate PDF in Base64 Document => [Status : "+Status.SUCCESSFUL+"]";

    }

    @Override
    public String generateExcelDocument() {
        return "Generate Excel Document => [Status : "+Status.ERROR+"]";
    }

    @Override
    public String generateExcelBase64Document() {
        return "Generate Excel in Base64 Document => [Status : "+Status.IN_PROGRESS+"]";
    }

    @Override
    public String generateCsvDocument() {
        return "Generate Csv Document => [Status : "+Status.SUCCESSFUL+"]";
    }

    @Override
    public String generateCsvBase64Document() {
        return "Generate Csv in Base64 Document => [Status : "+Status.ERROR+"]";
    }
}
