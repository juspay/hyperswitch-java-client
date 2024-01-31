package com.hyperswitch.client.api;

import com.hyperswitch.client.ApiClient;
import com.hyperswitch.client.model.BlocklistDataKind;
import com.hyperswitch.client.model.BlocklistRequest;
import com.hyperswitch.client.model.BlocklistResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlocklistApi
 */
class BlocklistApiTest {

    private BlocklistApi api;

    @BeforeEach
    public void setup() {
        api = new ApiClient().buildClient(BlocklistApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void blockAFingerprintTest() {
        BlocklistRequest blocklistRequest = null;
        // BlocklistResponse response = api.blockAFingerprint(blocklistRequest);

        // TODO: test validations
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    void listBlockedFingerprintsOfAParticularKindTest() {
        BlocklistDataKind dataKind = null;
        // BlocklistResponse response = api.listBlockedFingerprintsOfAParticularKind(dataKind);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    void listBlockedFingerprintsOfAParticularKindTestQueryMap() {
        BlocklistApi.ListBlockedFingerprintsOfAParticularKindQueryParams queryParams = new BlocklistApi.ListBlockedFingerprintsOfAParticularKindQueryParams()
            .dataKind(null);
        // BlocklistResponse response = api.listBlockedFingerprintsOfAParticularKind(queryParams);

    // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    void unblockAFingerprintTest() {
        BlocklistRequest blocklistRequest = null;
        // BlocklistResponse response = api.unblockAFingerprint(blocklistRequest);

        // TODO: test validations
    }

    
}
