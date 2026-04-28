package org.bouncycastle.crypto.digests;

import com.braze.h2;
import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {
    private static final int NB_1024 = 16;
    private static final int NB_512 = 8;
    private static final int NR_1024 = 14;
    private static final int NR_512 = 10;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, ByteCompanionObject.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, ByteCompanionObject.MIN_VALUE};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, ByteCompanionObject.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, ByteCompanionObject.MAX_VALUE, -118, 39, -57, -64, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, ByteCompanionObject.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, ByteCompanionObject.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, ByteCompanionObject.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, ByteCompanionObject.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};
    private int blockSize;
    private byte[] buf;
    private int bufOff;
    private int columns;
    private int hashSize;
    private long inputBlocks;
    private final CryptoServicePurpose purpose;
    private int rounds;
    private long[] state;
    private long[] tempState1;
    private long[] tempState2;

    public DSTU7564Digest(int i11, CryptoServicePurpose cryptoServicePurpose) {
        int i12;
        this.purpose = cryptoServicePurpose;
        if (i11 != 256 && i11 != 384 && i11 != 512) {
            a.f("Hash size is not recommended. Use 256/384/512 instead");
            throw null;
        }
        this.hashSize = i11 >>> 3;
        if (i11 > 256) {
            this.columns = 16;
            i12 = 14;
        } else {
            this.columns = 8;
            i12 = 10;
        }
        this.rounds = i12;
        int i13 = this.columns;
        int i14 = i13 << 3;
        this.blockSize = i14;
        long[] jArr = new long[i13];
        this.state = jArr;
        jArr[0] = i14;
        this.tempState1 = new long[i13];
        this.tempState2 = new long[i13];
        this.buf = new byte[i14];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    private void P(long[] jArr) {
        for (int i11 = 0; i11 < this.rounds; i11++) {
            long j9 = i11;
            for (int i12 = 0; i12 < this.columns; i12++) {
                jArr[i12] = jArr[i12] ^ j9;
                j9 += 16;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void Q(long[] jArr) {
        for (int i11 = 0; i11 < this.rounds; i11++) {
            long j9 = (((long) (((this.columns - 1) << 4) ^ i11)) << 56) | 67818912035696883L;
            for (int i12 = 0; i12 < this.columns; i12++) {
                jArr[i12] = jArr[i12] + j9;
                j9 -= 1152921504606846976L;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void copyIn(DSTU7564Digest dSTU7564Digest) {
        this.hashSize = dSTU7564Digest.hashSize;
        this.blockSize = dSTU7564Digest.blockSize;
        this.rounds = dSTU7564Digest.rounds;
        int i11 = this.columns;
        if (i11 <= 0 || i11 != dSTU7564Digest.columns) {
            this.columns = dSTU7564Digest.columns;
            this.state = Arrays.clone(dSTU7564Digest.state);
            int i12 = this.columns;
            this.tempState1 = new long[i12];
            this.tempState2 = new long[i12];
            this.buf = Arrays.clone(dSTU7564Digest.buf);
        } else {
            System.arraycopy(dSTU7564Digest.state, 0, this.state, 0, i11);
            System.arraycopy(dSTU7564Digest.buf, 0, this.buf, 0, this.blockSize);
        }
        this.inputBlocks = dSTU7564Digest.inputBlocks;
        this.bufOff = dSTU7564Digest.bufOff;
    }

    private static long mixColumn(long j9) {
        long j11 = ((9187201950435737471L & j9) << 1) ^ (((j9 & (-9187201950435737472L)) >>> 7) * 29);
        long jRotate = rotate(8, j9) ^ j9;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j9);
        long j12 = (j9 ^ jRotate2) ^ j11;
        return ((rotate(32, (((j12 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j12) >>> 6) * 29) ^ ((4557430888798830399L & j12) << 2))) ^ jRotate2) ^ rotate(40, j11)) ^ rotate(48, j11);
    }

    private void mixColumns(long[] jArr) {
        for (int i11 = 0; i11 < this.columns; i11++) {
            jArr[i11] = mixColumn(jArr[i11]);
        }
    }

    private void processBlock(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this.columns; i12++) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
            this.tempState1[i12] = this.state[i12] ^ jLittleEndianToLong;
            this.tempState2[i12] = jLittleEndianToLong;
        }
        P(this.tempState1);
        Q(this.tempState2);
        for (int i13 = 0; i13 < this.columns; i13++) {
            long[] jArr = this.state;
            jArr[i13] = jArr[i13] ^ (this.tempState1[i13] ^ this.tempState2[i13]);
        }
    }

    private static long rotate(int i11, long j9) {
        return (j9 << (-i11)) | (j9 >>> i11);
    }

    private void shiftRows(long[] jArr) {
        int i11 = this.columns;
        if (i11 == 8) {
            long j9 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = (j9 ^ j14) & (-4294967296L);
            long j19 = j9 ^ j18;
            long j21 = j14 ^ j18;
            long j22 = (j11 ^ j15) & 72057594021150720L;
            long j23 = j11 ^ j22;
            long j24 = j15 ^ j22;
            long j25 = (j12 ^ j16) & 281474976645120L;
            long j26 = j12 ^ j25;
            long j27 = j16 ^ j25;
            long j28 = (j13 ^ j17) & 1099511627520L;
            long j29 = j13 ^ j28;
            long j31 = j17 ^ j28;
            long j32 = (j19 ^ j26) & (-281470681808896L);
            long j33 = j19 ^ j32;
            long j34 = j26 ^ j32;
            long j35 = (j23 ^ j29) & 72056494543077120L;
            long j36 = j23 ^ j35;
            long j37 = j29 ^ j35;
            long j38 = (j21 ^ j27) & (-281470681808896L);
            long j39 = j21 ^ j38;
            long j41 = j27 ^ j38;
            long j42 = (j24 ^ j31) & 72056494543077120L;
            long j43 = j24 ^ j42;
            long j44 = j31 ^ j42;
            long j45 = (j33 ^ j36) & (-71777214294589696L);
            long j46 = j33 ^ j45;
            long j47 = j36 ^ j45;
            long j48 = (j34 ^ j37) & (-71777214294589696L);
            long j49 = j34 ^ j48;
            long j51 = j37 ^ j48;
            long j52 = (j39 ^ j43) & (-71777214294589696L);
            long j53 = (j41 ^ j44) & (-71777214294589696L);
            jArr[0] = j46;
            jArr[1] = j47;
            jArr[2] = j49;
            jArr[3] = j51;
            jArr[4] = j39 ^ j52;
            jArr[5] = j43 ^ j52;
            jArr[6] = j41 ^ j53;
            jArr[7] = j44 ^ j53;
            return;
        }
        if (i11 != 16) {
            h2.b("unsupported state size: only 512/1024 are allowed");
            return;
        }
        long j54 = jArr[0];
        long j55 = jArr[1];
        long j56 = jArr[2];
        long j57 = jArr[3];
        long j58 = jArr[4];
        long j59 = jArr[5];
        long j61 = jArr[6];
        long j62 = jArr[7];
        long j63 = jArr[8];
        long j64 = jArr[9];
        long j65 = jArr[10];
        long j66 = jArr[11];
        long j67 = jArr[12];
        long j68 = jArr[13];
        long j69 = jArr[14];
        long j71 = jArr[15];
        long j72 = (j54 ^ j63) & (-72057594037927936L);
        long j73 = j54 ^ j72;
        long j74 = j63 ^ j72;
        long j75 = (j55 ^ j64) & (-72057594037927936L);
        long j76 = j55 ^ j75;
        long j77 = j64 ^ j75;
        long j78 = (j56 ^ j65) & (-281474976710656L);
        long j79 = j56 ^ j78;
        long j81 = j65 ^ j78;
        long j82 = (j57 ^ j66) & (-1099511627776L);
        long j83 = j57 ^ j82;
        long j84 = j66 ^ j82;
        long j85 = (j58 ^ j67) & (-4294967296L);
        long j86 = j58 ^ j85;
        long j87 = j67 ^ j85;
        long j88 = (j59 ^ j68) & 72057594021150720L;
        long j89 = j59 ^ j88;
        long j90 = j68 ^ j88;
        long j91 = (j61 ^ j69) & 72057594037862400L;
        long j92 = j61 ^ j91;
        long j93 = j69 ^ j91;
        long j94 = (j62 ^ j71) & 72057594037927680L;
        long j95 = j62 ^ j94;
        long j96 = j71 ^ j94;
        long j97 = (j73 ^ j86) & 72057589742960640L;
        long j98 = j73 ^ j97;
        long j99 = j86 ^ j97;
        long j100 = (j76 ^ j89) & (-16777216);
        long j101 = j76 ^ j100;
        long j102 = j89 ^ j100;
        long j103 = (j79 ^ j92) & (-71776119061282816L);
        long j104 = j79 ^ j103;
        long j105 = j92 ^ j103;
        long j106 = (j83 ^ j95) & (-72056494526300416L);
        long j107 = j83 ^ j106;
        long j108 = j95 ^ j106;
        long j109 = (j74 ^ j87) & 72057589742960640L;
        long j110 = j74 ^ j109;
        long j111 = j87 ^ j109;
        long j112 = (j77 ^ j90) & (-16777216);
        long j113 = j77 ^ j112;
        long j114 = j90 ^ j112;
        long j115 = (j81 ^ j93) & (-71776119061282816L);
        long j116 = j81 ^ j115;
        long j117 = j93 ^ j115;
        long j118 = (j84 ^ j96) & (-72056494526300416L);
        long j119 = j84 ^ j118;
        long j120 = j96 ^ j118;
        long j121 = (j98 ^ j104) & (-281470681808896L);
        long j122 = j98 ^ j121;
        long j123 = j104 ^ j121;
        long j124 = (j101 ^ j107) & 72056494543077120L;
        long j125 = j101 ^ j124;
        long j126 = j107 ^ j124;
        long j127 = (j99 ^ j105) & (-281470681808896L);
        long j128 = j99 ^ j127;
        long j129 = j105 ^ j127;
        long j130 = (j102 ^ j108) & 72056494543077120L;
        long j131 = j102 ^ j130;
        long j132 = j108 ^ j130;
        long j133 = (j110 ^ j116) & (-281470681808896L);
        long j134 = j110 ^ j133;
        long j135 = j116 ^ j133;
        long j136 = (j113 ^ j119) & 72056494543077120L;
        long j137 = j113 ^ j136;
        long j138 = j119 ^ j136;
        long j139 = (j111 ^ j117) & (-281470681808896L);
        long j140 = j111 ^ j139;
        long j141 = j117 ^ j139;
        long j142 = (j114 ^ j120) & 72056494543077120L;
        long j143 = j114 ^ j142;
        long j144 = j120 ^ j142;
        long j145 = (j122 ^ j125) & (-71777214294589696L);
        long j146 = j122 ^ j145;
        long j147 = j125 ^ j145;
        long j148 = (j123 ^ j126) & (-71777214294589696L);
        long j149 = j123 ^ j148;
        long j150 = j126 ^ j148;
        long j151 = (j128 ^ j131) & (-71777214294589696L);
        long j152 = j128 ^ j151;
        long j153 = j131 ^ j151;
        long j154 = (j129 ^ j132) & (-71777214294589696L);
        long j155 = j129 ^ j154;
        long j156 = j132 ^ j154;
        long j157 = (j134 ^ j137) & (-71777214294589696L);
        long j158 = j134 ^ j157;
        long j159 = j137 ^ j157;
        long j160 = (j135 ^ j138) & (-71777214294589696L);
        long j161 = j135 ^ j160;
        long j162 = j138 ^ j160;
        long j163 = (j140 ^ j143) & (-71777214294589696L);
        long j164 = (j141 ^ j144) & (-71777214294589696L);
        jArr[0] = j146;
        jArr[1] = j147;
        jArr[2] = j149;
        jArr[3] = j150;
        jArr[4] = j152;
        jArr[5] = j153;
        jArr[6] = j155;
        jArr[7] = j156;
        jArr[8] = j158;
        jArr[9] = j159;
        jArr[10] = j161;
        jArr[11] = j162;
        jArr[12] = j140 ^ j163;
        jArr[13] = j143 ^ j163;
        jArr[14] = j141 ^ j164;
        jArr[15] = j144 ^ j164;
    }

    private void subBytes(long[] jArr) {
        for (int i11 = 0; i11 < this.columns; i11++) {
            long j9 = jArr[i11];
            int i12 = (int) j9;
            int i13 = (int) (j9 >>> 32);
            byte[] bArr = S0;
            byte b8 = bArr[i12 & 255];
            byte[] bArr2 = S1;
            byte b11 = bArr2[(i12 >>> 8) & 255];
            byte[] bArr3 = S2;
            byte b12 = bArr3[(i12 >>> 16) & 255];
            byte[] bArr4 = S3;
            int i14 = (bArr4[i12 >>> 24] << 24) | (b8 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i13 & 255];
            byte b14 = bArr2[(i13 >>> 8) & 255];
            byte b15 = bArr3[(i13 >>> 16) & 255];
            jArr[i11] = (((long) i14) & 4294967295L) | (((long) ((bArr4[i13 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16)))) << 32);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i15 = i14 + 1;
        this.bufOff = i15;
        bArr2[i14] = ByteCompanionObject.MIN_VALUE;
        int i16 = this.blockSize - 12;
        int i17 = 0;
        if (i15 > i16) {
            while (true) {
                int i18 = this.bufOff;
                if (i18 >= this.blockSize) {
                    break;
                }
                byte[] bArr3 = this.buf;
                this.bufOff = i18 + 1;
                bArr3[i18] = 0;
            }
            this.bufOff = 0;
            processBlock(this.buf, 0);
        }
        while (true) {
            i12 = this.bufOff;
            if (i12 >= i16) {
                break;
            }
            byte[] bArr4 = this.buf;
            this.bufOff = i12 + 1;
            bArr4[i12] = 0;
        }
        long j9 = (((this.inputBlocks & 4294967295L) * ((long) this.blockSize)) + ((long) i14)) << 3;
        Pack.intToLittleEndian((int) j9, this.buf, i12);
        int i19 = this.bufOff + 4;
        this.bufOff = i19;
        Pack.longToLittleEndian((j9 >>> 32) + (((this.inputBlocks >>> 32) * ((long) this.blockSize)) << 3), this.buf, i19);
        processBlock(this.buf, 0);
        System.arraycopy(this.state, 0, this.tempState1, 0, this.columns);
        P(this.tempState1);
        while (true) {
            i13 = this.columns;
            if (i17 >= i13) {
                break;
            }
            long[] jArr = this.state;
            jArr[i17] = jArr[i17] ^ this.tempState1[i17];
            i17++;
        }
        for (int i21 = i13 - (this.hashSize >>> 3); i21 < this.columns; i21++) {
            Pack.longToLittleEndian(this.state[i21], bArr, i11);
            i11 += 8;
        }
        reset();
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0L);
        this.state[0] = this.blockSize;
        this.inputBlocks = 0L;
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (this.bufOff != 0 && i12 > 0) {
            update(bArr[i11]);
            i12--;
            i11++;
        }
        if (i12 > 0) {
            while (i12 >= this.blockSize) {
                processBlock(bArr, i11);
                int i13 = this.blockSize;
                i11 += i13;
                i12 -= i13;
                this.inputBlocks++;
            }
            while (i12 > 0) {
                update(bArr[i11]);
                i12--;
                i11++;
            }
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        byte[] bArr = this.buf;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr[i11] = b8;
        if (i12 == this.blockSize) {
            processBlock(bArr, 0);
            this.bufOff = 0;
            this.inputBlocks++;
        }
    }

    public DSTU7564Digest(int i11) {
        this(i11, CryptoServicePurpose.ANY);
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        this.purpose = dSTU7564Digest.purpose;
        copyIn(dSTU7564Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
