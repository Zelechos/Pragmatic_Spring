package com.test.concepts.learn.spring.meta_annotations;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Learn who to create Meta-Annotations
 *
 * @author Alex T.H.
 * @version v0.0.7
 * @since 21.0.0 2024-02-08
 */
@ClassicInstance
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    private String ether;
    private String version;
    private boolean isActive;

}
