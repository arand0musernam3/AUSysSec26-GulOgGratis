package org.bouncycastle.crypto.agreement.ecjpake;

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
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class ECJPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ECPoint f33014b;
    private final Digest digest;
    private ECCurve.AbstractFp ecCurve;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ECPoint f33015g;
    private ECPoint gx1;
    private ECPoint gx2;
    private ECPoint gx3;
    private ECPoint gx4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f33016h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f33017n;
    private final String participantId;
    private String partnerParticipantId;
    private char[] password;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f33018q;
    private final SecureRandom random;
    private int state;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f33019x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f33020x2;

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKECurve eCJPAKECurve, Digest digest, SecureRandom secureRandom) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(cArr, "password");
        ECJPAKEUtil.validateNotNull(eCJPAKECurve, "curve params");
        ECJPAKEUtil.validateNotNull(digest, "digest");
        ECJPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            a.f("Password must not be empty.");
            throw null;
        }
        this.participantId = str;
        this.password = Arrays.copyOf(cArr, cArr.length);
        this.ecCurve = eCJPAKECurve.getCurve();
        this.f33015g = eCJPAKECurve.getG();
        this.f33016h = eCJPAKECurve.getH();
        this.f33017n = eCJPAKECurve.getN();
        this.f33018q = eCJPAKECurve.getQ();
        this.digest = digest;
        this.random = secureRandom;
        this.state = 0;
    }

    private BigInteger calculateS() {
        try {
            return ECJPAKEUtil.calculateS(this.f33017n, this.password);
        } catch (CryptoException e5) {
            throw Exceptions.illegalStateException(e5.getMessage(), e5);
        }
    }

    public BigInteger calculateKeyingMaterial() {
        int i11 = this.state;
        if (i11 >= 50) {
            i1.q(this.participantId, "Key already calculated for ");
            return null;
        }
        if (i11 < 40) {
            i1.q(this.participantId, "Round2 payload must be validated prior to creating key for ");
            return null;
        }
        BigInteger bigIntegerCalculateS = calculateS();
        Arrays.fill(this.password, (char) 0);
        this.password = null;
        BigInteger bigIntegerCalculateKeyingMaterial = ECJPAKEUtil.calculateKeyingMaterial(this.f33017n, this.gx4, this.f33020x2, bigIntegerCalculateS, this.f33014b);
        this.f33019x1 = null;
        this.f33020x2 = null;
        this.f33014b = null;
        this.state = 50;
        return bigIntegerCalculateKeyingMaterial;
    }

    public ECJPAKERound1Payload createRound1PayloadToSend() {
        if (this.state >= 10) {
            i1.q(this.participantId, "Round1 payload already created for ");
            return null;
        }
        this.f33019x1 = ECJPAKEUtil.generateX1(this.f33017n, this.random);
        this.f33020x2 = ECJPAKEUtil.generateX1(this.f33017n, this.random);
        this.gx1 = ECJPAKEUtil.calculateGx(this.f33015g, this.f33019x1);
        this.gx2 = ECJPAKEUtil.calculateGx(this.f33015g, this.f33020x2);
        ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof = ECJPAKEUtil.calculateZeroKnowledgeProof(this.f33015g, this.f33017n, this.f33019x1, this.gx1, this.digest, this.participantId, this.random);
        ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof2 = ECJPAKEUtil.calculateZeroKnowledgeProof(this.f33015g, this.f33017n, this.f33020x2, this.gx2, this.digest, this.participantId, this.random);
        this.state = 10;
        return new ECJPAKERound1Payload(this.participantId, this.gx1, this.gx2, eCSchnorrZKPCalculateZeroKnowledgeProof, eCSchnorrZKPCalculateZeroKnowledgeProof2);
    }

    public ECJPAKERound2Payload createRound2PayloadToSend() {
        String str;
        int i11 = this.state;
        if (i11 >= 30) {
            str = "Round2 payload already created for ";
        } else {
            if (i11 >= 20) {
                ECPoint eCPointCalculateGA = ECJPAKEUtil.calculateGA(this.gx1, this.gx3, this.gx4);
                BigInteger bigIntegerCalculateX2s = ECJPAKEUtil.calculateX2s(this.f33017n, this.f33020x2, calculateS());
                ECPoint eCPointCalculateA = ECJPAKEUtil.calculateA(eCPointCalculateGA, bigIntegerCalculateX2s);
                ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof = ECJPAKEUtil.calculateZeroKnowledgeProof(eCPointCalculateGA, this.f33017n, bigIntegerCalculateX2s, eCPointCalculateA, this.digest, this.participantId, this.random);
                this.state = 30;
                return new ECJPAKERound2Payload(this.participantId, eCPointCalculateA, eCSchnorrZKPCalculateZeroKnowledgeProof);
            }
            str = "Round1 payload must be validated prior to creating Round2 payload for ";
        }
        i1.q(this.participantId, str);
        return null;
    }

    public ECJPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
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
        BigInteger bigIntegerCalculateMacTag = ECJPAKEUtil.calculateMacTag(str, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest);
        this.state = 60;
        return new ECJPAKERound3Payload(this.participantId, bigIntegerCalculateMacTag);
    }

    public int getState() {
        return this.state;
    }

    public void validateRound1PayloadReceived(ECJPAKERound1Payload eCJPAKERound1Payload) throws CryptoException {
        if (this.state >= 20) {
            i1.q(this.participantId, "Validation already attempted for round1 payload for");
            return;
        }
        this.partnerParticipantId = eCJPAKERound1Payload.getParticipantId();
        this.gx3 = eCJPAKERound1Payload.getGx1();
        this.gx4 = eCJPAKERound1Payload.getGx2();
        ECSchnorrZKP knowledgeProofForX1 = eCJPAKERound1Payload.getKnowledgeProofForX1();
        ECSchnorrZKP knowledgeProofForX2 = eCJPAKERound1Payload.getKnowledgeProofForX2();
        ECJPAKEUtil.validateParticipantIdsDiffer(this.participantId, eCJPAKERound1Payload.getParticipantId());
        ECJPAKEUtil.validateZeroKnowledgeProof(this.f33015g, this.gx3, knowledgeProofForX1, this.f33018q, this.f33017n, this.ecCurve, this.f33016h, eCJPAKERound1Payload.getParticipantId(), this.digest);
        ECJPAKEUtil.validateZeroKnowledgeProof(this.f33015g, this.gx4, knowledgeProofForX2, this.f33018q, this.f33017n, this.ecCurve, this.f33016h, eCJPAKERound1Payload.getParticipantId(), this.digest);
        this.state = 20;
    }

    public void validateRound2PayloadReceived(ECJPAKERound2Payload eCJPAKERound2Payload) throws CryptoException {
        int i11 = this.state;
        if (i11 >= 40) {
            i1.q(this.participantId, "Validation already attempted for round2 payload for");
            return;
        }
        if (i11 < 20) {
            i1.q(this.participantId, "Round1 payload must be validated prior to validating Round2 payload for ");
            return;
        }
        ECPoint eCPointCalculateGA = ECJPAKEUtil.calculateGA(this.gx3, this.gx1, this.gx2);
        this.f33014b = eCJPAKERound2Payload.getA();
        ECSchnorrZKP knowledgeProofForX2s = eCJPAKERound2Payload.getKnowledgeProofForX2s();
        ECJPAKEUtil.validateParticipantIdsDiffer(this.participantId, eCJPAKERound2Payload.getParticipantId());
        ECJPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, eCJPAKERound2Payload.getParticipantId());
        ECJPAKEUtil.validateZeroKnowledgeProof(eCPointCalculateGA, this.f33014b, knowledgeProofForX2s, this.f33018q, this.f33017n, this.ecCurve, this.f33016h, eCJPAKERound2Payload.getParticipantId(), this.digest);
        this.state = 40;
    }

    public void validateRound3PayloadReceived(ECJPAKERound3Payload eCJPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
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
        ECJPAKEUtil.validateParticipantIdsDiffer(str, eCJPAKERound3Payload.getParticipantId());
        ECJPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, eCJPAKERound3Payload.getParticipantId());
        ECJPAKEUtil.validateMacTag(this.participantId, this.partnerParticipantId, this.gx1, this.gx2, this.gx3, this.gx4, bigInteger, this.digest, eCJPAKERound3Payload.getMacTag());
        this.gx1 = null;
        this.gx2 = null;
        this.gx3 = null;
        this.gx4 = null;
        this.state = 70;
    }

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKECurve eCJPAKECurve) {
        this(str, cArr, eCJPAKECurve, SHA256Digest.newInstance(), CryptoServicesRegistrar.getSecureRandom());
    }

    public ECJPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, ECJPAKECurves.NIST_P256);
    }
}
