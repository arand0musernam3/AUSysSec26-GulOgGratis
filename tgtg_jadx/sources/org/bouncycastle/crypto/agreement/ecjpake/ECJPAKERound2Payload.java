package org.bouncycastle.crypto.agreement.ecjpake;

import com.braze.Constants;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECJPAKERound2Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECPoint f33021a;
    private final ECSchnorrZKP knowledgeProofForX2s;
    private final String participantId;

    public ECJPAKERound2Payload(String str, ECPoint eCPoint, ECSchnorrZKP eCSchnorrZKP) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(eCPoint, Constants.BRAZE_PUSH_CONTENT_KEY);
        ECJPAKEUtil.validateNotNull(eCSchnorrZKP, "knowledgeProofForX2s");
        this.participantId = str;
        this.f33021a = eCPoint;
        this.knowledgeProofForX2s = eCSchnorrZKP;
    }

    public ECPoint getA() {
        return this.f33021a;
    }

    public ECSchnorrZKP getKnowledgeProofForX2s() {
        return this.knowledgeProofForX2s;
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
