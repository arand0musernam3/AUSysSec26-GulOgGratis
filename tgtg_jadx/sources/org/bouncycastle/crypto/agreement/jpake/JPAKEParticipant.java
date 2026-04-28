package org.bouncycastle.crypto.agreement.jpake;

import com.braze.Constants;
import com.braze.h2;
import e0.f;
import i4.a;
import java.math.BigInteger;
import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class JPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f33023b;
    private final Digest digest;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BigInteger f33024g;
    private BigInteger gx1;
    private BigInteger gx2;
    private BigInteger gx3;
    private BigInteger gx4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BigInteger f33025p;
    private final String participantId;
    private String partnerParticipantId;
    private char[] password;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f33026q;
    private final SecureRandom random;
    private int state;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f33027x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f33028x2;

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup, Digest digest, SecureRandom secureRandom) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(cArr, "password");
        JPAKEUtil.validateNotNull(jPAKEPrimeOrderGroup, Constants.BRAZE_PUSH_PRIORITY_KEY);
        JPAKEUtil.validateNotNull(digest, "digest");
        JPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            a.f("Password must not be empty.");
            throw null;
        }
        this.participantId = str;
        this.password = Arrays.copyOf(cArr, cArr.length);
        this.f33025p = jPAKEPrimeOrderGroup.getP();
        this.f33026q = jPAKEPrimeOrderGroup.getQ();
        this.f33024g = jPAKEPrimeOrderGroup.getG();
        this.digest = digest;
        this.random = secureRandom;
        this.state = 0;
    }

    private BigInteger calculateS() {
        try {
            return JPAKEUtil.calculateS(this.f33026q, this.password);
        } catch (CryptoException e5) {
            throw Exceptions.illegalStateException(e5.getMessage(), e5);
        }
    }

    public BigInteger calculateKeyingMaterial() {
        String str;
        int i11 = this.state;
        if (i11 >= 50) {
            str = "Key already calculated for ";
        } else {
            if (i11 >= 40) {
                BigInteger bigIntegerCalculateS = calculateS();
                Arrays.fill(this.password, (char) 0);
                this.password = null;
                BigInteger bigIntegerCalculateKeyingMaterial = JPAKEUtil.calculateKeyingMaterial(this.f33025p, this.f33026q, this.gx4, this.f33028x2, bigIntegerCalculateS, this.f33023b);
                this.f33027x1 = null;
                this.f33028x2 = null;
                this.f33023b = null;
                this.state = 50;
                return bigIntegerCalculateKeyingMaterial;
            }
            str = "Round2 payload must be validated prior to creating key for ";
        }
        i1.q(this.participantId, str);
        return null;
    }

    public JPAKERound1Payload createRound1PayloadToSend() {
        if (this.state >= 10) {
            i1.q(this.participantId, "Round1 payload already created for ");
            return null;
        }
        this.f33027x1 = JPAKEUtil.generateX1(this.f33026q, this.random);
        this.f33028x2 = JPAKEUtil.generateX2(this.f33026q, this.random);
        this.gx1 = JPAKEUtil.calculateGx(this.f33025p, this.f33024g, this.f33027x1);
        this.gx2 = JPAKEUtil.calculateGx(this.f33025p, this.f33024g, this.f33028x2);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f33025p, this.f33026q, this.f33024g, this.gx1, this.f33027x1, this.participantId, this.digest, this.random);
        BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof2 = JPAKEUtil.calculateZeroKnowledgeProof(this.f33025p, this.f33026q, this.f33024g, this.gx2, this.f33028x2, this.participantId, this.digest, this.random);
        this.state = 10;
        return new JPAKERound1Payload(this.participantId, this.gx1, this.gx2, bigIntegerArrCalculateZeroKnowledgeProof, bigIntegerArrCalculateZeroKnowledgeProof2);
    }

    public JPAKERound2Payload createRound2PayloadToSend() {
        String str;
        int i11 = this.state;
        if (i11 >= 30) {
            str = "Round2 payload already created for ";
        } else {
            if (i11 >= 20) {
                BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(this.f33025p, this.gx1, this.gx3, this.gx4);
                BigInteger bigIntegerCalculateX2s = JPAKEUtil.calculateX2s(this.f33026q, this.f33028x2, calculateS());
                BigInteger bigIntegerCalculateA = JPAKEUtil.calculateA(this.f33025p, this.f33026q, bigIntegerCalculateGA, bigIntegerCalculateX2s);
                BigInteger[] bigIntegerArrCalculateZeroKnowledgeProof = JPAKEUtil.calculateZeroKnowledgeProof(this.f33025p, this.f33026q, bigIntegerCalculateGA, bigIntegerCalculateA, bigIntegerCalculateX2s, this.participantId, this.digest, this.random);
                this.state = 30;
                return new JPAKERound2Payload(this.participantId, bigIntegerCalculateA, bigIntegerArrCalculateZeroKnowledgeProof);
            }
            str = "Round1 payload must be validated prior to creating Round2 payload for ";
        }
        i1.q(this.participantId, str);
        return null;
    }

    public JPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        int i11 = this.state;
        if (i11 >= 60) {
            i1.q(this.participantId, "Round3 payload already created for ");
            return null;
        }
        String str = this.participantId;
        if (i11 < 50) {
            h2.b(f.k("Keying material must be calculated prior to creating Round3 payload for ", str));
            return null;
        }
        BigInteger bigIntegerCalculateMacTag = JPAKEUtil.calculateMacTag(str, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest);
        this.state = 60;
        return new JPAKERound3Payload(this.participantId, bigIntegerCalculateMacTag);
    }

    public int getState() {
        return this.state;
    }

    public void validateRound1PayloadReceived(JPAKERound1Payload jPAKERound1Payload) throws CryptoException {
        if (this.state >= 20) {
            i1.q(this.participantId, "Validation already attempted for round1 payload for");
            return;
        }
        this.partnerParticipantId = jPAKERound1Payload.getParticipantId();
        this.gx3 = jPAKERound1Payload.getGx1();
        this.gx4 = jPAKERound1Payload.getGx2();
        BigInteger[] knowledgeProofForX1 = jPAKERound1Payload.getKnowledgeProofForX1();
        BigInteger[] knowledgeProofForX2 = jPAKERound1Payload.getKnowledgeProofForX2();
        JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound1Payload.getParticipantId());
        JPAKEUtil.validateGx4(this.gx4);
        JPAKEUtil.validateZeroKnowledgeProof(this.f33025p, this.f33026q, this.f33024g, this.gx3, knowledgeProofForX1, jPAKERound1Payload.getParticipantId(), this.digest);
        JPAKEUtil.validateZeroKnowledgeProof(this.f33025p, this.f33026q, this.f33024g, this.gx4, knowledgeProofForX2, jPAKERound1Payload.getParticipantId(), this.digest);
        this.state = 20;
    }

    public void validateRound2PayloadReceived(JPAKERound2Payload jPAKERound2Payload) throws CryptoException {
        int i11 = this.state;
        if (i11 >= 40) {
            i1.q(this.participantId, "Validation already attempted for round2 payload for");
            return;
        }
        if (i11 < 20) {
            i1.q(this.participantId, "Round1 payload must be validated prior to validating Round2 payload for ");
            return;
        }
        BigInteger bigIntegerCalculateGA = JPAKEUtil.calculateGA(this.f33025p, this.gx3, this.gx1, this.gx2);
        this.f33023b = jPAKERound2Payload.getA();
        BigInteger[] knowledgeProofForX2s = jPAKERound2Payload.getKnowledgeProofForX2s();
        JPAKEUtil.validateParticipantIdsDiffer(this.participantId, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound2Payload.getParticipantId());
        JPAKEUtil.validateGa(bigIntegerCalculateGA);
        JPAKEUtil.validateZeroKnowledgeProof(this.f33025p, this.f33026q, bigIntegerCalculateGA, this.f33023b, knowledgeProofForX2s, jPAKERound2Payload.getParticipantId(), this.digest);
        this.state = 40;
    }

    public void validateRound3PayloadReceived(JPAKERound3Payload jPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        int i11 = this.state;
        if (i11 >= 70) {
            i1.q(this.participantId, "Validation already attempted for round3 payload for");
            return;
        }
        String str = this.participantId;
        if (i11 < 50) {
            h2.b(f.k("Keying material must be calculated validated prior to validating Round3 payload for ", str));
            return;
        }
        JPAKEUtil.validateParticipantIdsDiffer(str, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, jPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateMacTag(this.participantId, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest, jPAKERound3Payload.getMacTag());
        this.gx1 = null;
        this.gx2 = null;
        this.gx3 = null;
        this.gx4 = null;
        this.state = 70;
    }

    public JPAKEParticipant(String str, char[] cArr, JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup) {
        this(str, cArr, jPAKEPrimeOrderGroup, SHA256Digest.newInstance(), CryptoServicesRegistrar.getSecureRandom());
    }

    public JPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, JPAKEPrimeOrderGroups.NIST_3072);
    }
}
