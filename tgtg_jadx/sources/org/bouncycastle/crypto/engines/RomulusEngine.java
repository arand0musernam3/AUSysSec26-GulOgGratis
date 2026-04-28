package org.bouncycastle.crypto.engines;

import c50.w;
import java.lang.reflect.Array;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.RomulusDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes3.dex */
public class RomulusEngine extends AEADBaseEngine {
    private static final int AD_BLK_LEN_HALF = 16;
    private final byte[] CNT;
    private Instance instance;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f33128k;
    private byte[] npub;
    private static final byte[] sbox_8 = {101, 76, 106, 66, 75, 99, 67, 107, 85, 117, 90, 122, 83, 115, 91, 123, 53, -116, 58, -127, -119, 51, ByteCompanionObject.MIN_VALUE, 59, -107, 37, -104, 42, -112, 35, -103, 43, -27, -52, -24, -63, -55, -32, -64, -23, -43, -11, -40, -8, -48, -16, -39, -7, -91, 28, -88, 18, 27, -96, 19, -87, 5, -75, 10, -72, 3, -80, 11, -71, 50, -120, 60, -123, -115, 52, -124, 61, -111, 34, -100, 44, -108, 36, -99, 45, 98, 74, 108, 69, 77, 100, 68, 109, 82, 114, 92, 124, 84, 116, 93, 125, -95, 26, -84, 21, 29, -92, 20, -83, 2, -79, 12, PSSSigner.TRAILER_IMPLICIT, 4, -76, 13, -67, -31, -56, -20, -59, -51, -28, -60, -19, -47, -15, -36, -4, -44, -12, -35, -3, 54, -114, 56, -126, -117, 48, -125, 57, -106, 38, -102, 40, -109, 32, -101, 41, 102, 78, 104, 65, 73, 96, 64, 105, 86, 118, 88, 120, 80, 112, 89, 121, -90, 30, -86, 17, 25, -93, 16, -85, 6, -74, 8, -70, 0, -77, 9, -69, -26, -50, -22, -62, -53, -29, -61, -21, -42, -10, -38, -6, -45, -13, -37, -5, 49, -118, 62, -122, -113, 55, -121, 63, -110, 33, -98, 46, -105, 39, -97, 47, 97, 72, 110, 70, 79, 103, 71, 111, 81, 113, 94, 126, 87, 119, 95, ByteCompanionObject.MAX_VALUE, -94, 24, -82, 22, 31, -89, 23, -81, 1, -78, 14, -66, 7, -73, 15, -65, -30, -54, -18, -58, -49, -25, -57, -17, -46, -14, -34, -2, -41, -9, -33, -1};
    private static final byte[] TWEAKEY_P = {9, 15, 8, 13, 10, 14, 12, 11, 0, 1, 2, 3, 4, 5, 6, 7};
    private static final byte[] RC = {1, 3, 7, 15, 31, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, 22, 44, 24, 48, 33, 2, 5, 11, 23, 46, 28, 56, 49, 35, 6, 13, 27, 54, 45, 26};

    public interface Instance {
        void processBufferAAD(byte[] bArr, int i11);

        void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

        void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

        void processFinalAAD();

        void processFinalBlock(byte[] bArr, int i11);

        void reset();
    }

    public class RomulusN implements Instance {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f33130s = new byte[16];
        boolean twist;

        public RomulusN() {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i11) {
            if (this.twist) {
                Bytes.xorTo(16, bArr, i11, this.f33130s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.f33130s, romulusEngine.f33128k, bArr, i11, RomulusEngine.this.CNT, (byte) 8);
            }
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.lfsr_gf56(romulusEngine2.CNT);
            this.twist = !this.twist;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
            RomulusEngine.this.g8A(this.f33130s, bArr2, i12);
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = i13 + i12;
                byte b8 = (byte) (bArr2[i14] ^ bArr[i13 + i11]);
                bArr2[i14] = b8;
                byte[] bArr3 = this.f33130s;
                bArr3[i13] = (byte) (b8 ^ bArr3[i13]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f33130s, romulusEngine2.f33128k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
            RomulusEngine.this.g8A(this.f33130s, bArr2, i12);
            for (int i13 = 0; i13 < 16; i13++) {
                byte[] bArr3 = this.f33130s;
                int i14 = i13 + i11;
                bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i14]);
                int i15 = i13 + i12;
                bArr2[i15] = (byte) (bArr2[i15] ^ bArr[i14]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.f33130s, romulusEngine2.f33128k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            int i11 = RomulusEngine.this.m_aadPos;
            if (i11 != 0) {
                byte[] bArr = new byte[16];
                int iMin = Math.min(i11, 16);
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.pad(romulusEngine.m_aad, 0, bArr, 16, iMin);
                if (this.twist) {
                    Bytes.xorTo(16, bArr, this.f33130s);
                } else {
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    romulusEngine2.block_cipher(this.f33130s, romulusEngine2.f33128k, bArr, 0, RomulusEngine.this.CNT, (byte) 8);
                }
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
            }
            int len = RomulusEngine.this.aadOperator.getLen();
            RomulusEngine romulusEngine4 = RomulusEngine.this;
            if (len == 0) {
                romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                romulusEngine5.block_cipher(this.f33130s, romulusEngine5.f33128k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
            } else {
                int i12 = romulusEngine4.m_aadPos & 15;
                byte[] bArr2 = this.f33130s;
                byte[] bArr3 = romulusEngine4.f33128k;
                if (i12 != 0) {
                    romulusEngine4.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
                } else {
                    romulusEngine4.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 24);
                }
            }
            RomulusEngine romulusEngine6 = RomulusEngine.this;
            romulusEngine6.reset_lfsr_gf56(romulusEngine6.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i11) {
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE) == 0) {
                romulusEngine.lfsr_gf56(romulusEngine.CNT);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.f33130s, romulusEngine2.f33128k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 21);
            } else {
                int i12 = romulusEngine.m_bufPos;
                if (i12 != 0) {
                    int iMin = Math.min(i12, 16);
                    RomulusEngine romulusEngine3 = RomulusEngine.this;
                    romulusEngine3.rho(romulusEngine3.m_buf, 0, bArr, i11, this.f33130s, iMin);
                    RomulusEngine romulusEngine4 = RomulusEngine.this;
                    romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                    RomulusEngine romulusEngine5 = RomulusEngine.this;
                    romulusEngine5.block_cipher(this.f33130s, romulusEngine5.f33128k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, RomulusEngine.this.m_bufPos == 16 ? (byte) 20 : (byte) 21);
                }
            }
            RomulusEngine romulusEngine6 = RomulusEngine.this;
            romulusEngine6.g8A(this.f33130s, romulusEngine6.mac, 0);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f33130s);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public static class RomulusParameters {
        public static final int ROMULUS_M = 0;
        public static final int ROMULUS_N = 1;
        public static final int ROMULUS_T = 2;
        public static final RomulusParameters RomulusM = new RomulusParameters(0);
        public static final RomulusParameters RomulusN = new RomulusParameters(1);
        public static final RomulusParameters RomulusT = new RomulusParameters(2);
        private final int ord;

        public RomulusParameters(int i11) {
            this.ord = i11;
        }
    }

    public class RomulusT implements Instance {
        byte[] CNT_Z;
        byte[] LR;
        byte[] S;
        byte[] T;
        byte[] Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f33131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f33132h;

        private RomulusT() {
            this.f33132h = new byte[16];
            this.f33131g = new byte[16];
            this.Z = new byte[16];
            this.CNT_Z = new byte[7];
            this.LR = new byte[32];
            this.T = new byte[16];
            this.S = new byte[16];
        }

        private void processAfterAbsorbCiphertext() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i11 = romulusEngine.m_aadPos;
            int i12 = romulusEngine.BlockSize;
            if (i11 == i12) {
                RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, romulusEngine.m_aad, 0);
                RomulusEngine.this.m_aadPos = 0;
            } else {
                romulusEngine.m_aadPos = i12;
            }
            RomulusEngine.this.lfsr_gf56(this.CNT_Z);
        }

        private void processBuffer(byte[] bArr, int i11, byte[] bArr2, int i12) {
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.block_cipher(this.S, this.Z, this.T, 0, romulusEngine.CNT, (byte) 64);
            Bytes.xor(16, this.S, bArr, i11, bArr2, i12);
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 65);
            System.arraycopy(this.S, 0, this.Z, 0, 16);
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i11) {
            RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, bArr, i11);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
            processBuffer(bArr, i11, bArr2, i12);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr, i11, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
            processBuffer(bArr, i11, bArr2, i12);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr2, i12, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            Arrays.fill(romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.AADBufferSize - 1, (byte) 0);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            int i11 = romulusEngine2.m_aadPos;
            if (i11 >= 16) {
                byte[] bArr = romulusEngine2.m_aad;
                bArr[romulusEngine2.AADBufferSize - 1] = (byte) (i11 & 15);
                RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, bArr, 0);
                RomulusEngine.this.m_aadPos = 0;
                return;
            }
            if (i11 < 0 || romulusEngine2.aadOperator.getLen() == 0) {
                return;
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            byte[] bArr2 = romulusEngine3.m_aad;
            int i12 = romulusEngine3.BlockSize;
            bArr2[i12 - 1] = (byte) (romulusEngine3.m_aadPos & 15);
            romulusEngine3.m_aadPos = i12;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i11) {
            char c3;
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i12 = len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE);
            int i13 = romulusEngine.m_bufPos;
            if (i13 != 0) {
                int iMin = Math.min(i13, 16);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 64);
                Bytes.xor(iMin, RomulusEngine.this.m_buf, this.S, bArr, i11);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                if (!romulusEngine4.forEncryption) {
                    bArr = romulusEngine4.m_buf;
                    i11 = 0;
                }
                System.arraycopy(bArr, i11, romulusEngine4.m_aad, romulusEngine4.m_aadPos, romulusEngine4.m_bufPos);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                Arrays.fill(romulusEngine5.m_aad, romulusEngine5.m_aadPos + romulusEngine5.m_bufPos, romulusEngine5.AADBufferSize - 1, (byte) 0);
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                byte[] bArr2 = romulusEngine6.m_aad;
                int i14 = romulusEngine6.m_aadPos;
                bArr2[(romulusEngine6.BlockSize + i14) - 1] = (byte) (romulusEngine6.m_bufPos & 15);
                if (i14 == 0) {
                    byte[] bArr3 = romulusEngine6.npub;
                    RomulusEngine romulusEngine7 = RomulusEngine.this;
                    byte[] bArr4 = romulusEngine7.m_aad;
                    int i15 = romulusEngine7.BlockSize;
                    System.arraycopy(bArr3, 0, bArr4, i15, i15);
                    c3 = 0;
                } else {
                    c3 = 16;
                }
                RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, RomulusEngine.this.m_aad, 0);
                RomulusEngine.this.lfsr_gf56(this.CNT_Z);
            } else if (romulusEngine.m_aadPos != 0) {
                if (i12 > 0) {
                    Arrays.fill(romulusEngine.m_aad, romulusEngine.BlockSize, romulusEngine.AADBufferSize, (byte) 0);
                } else {
                    if (romulusEngine.aadOperator.getLen() != 0) {
                        byte[] bArr5 = RomulusEngine.this.npub;
                        RomulusEngine romulusEngine8 = RomulusEngine.this;
                        System.arraycopy(bArr5, 0, romulusEngine8.m_aad, romulusEngine8.m_aadPos, 16);
                        RomulusEngine.this.m_aadPos = 0;
                        c3 = 0;
                    }
                    RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, RomulusEngine.this.m_aad, 0);
                }
                c3 = 16;
                RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, RomulusEngine.this.m_aad, 0);
            } else if (i12 > 0) {
                Arrays.fill(romulusEngine.m_aad, 0, romulusEngine.BlockSize, (byte) 0);
                byte[] bArr6 = RomulusEngine.this.npub;
                RomulusEngine romulusEngine9 = RomulusEngine.this;
                byte[] bArr7 = romulusEngine9.m_aad;
                int i16 = romulusEngine9.BlockSize;
                System.arraycopy(bArr6, 0, bArr7, i16, i16);
                RomulusEngine.hirose_128_128_256(this.f33132h, this.f33131g, RomulusEngine.this.m_aad, 0);
                c3 = 0;
            } else {
                c3 = 16;
            }
            if (c3 == 16) {
                System.arraycopy(RomulusEngine.this.npub, 0, RomulusEngine.this.m_aad, 0, 16);
                System.arraycopy(RomulusEngine.this.CNT, 0, RomulusEngine.this.m_aad, 16, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 23, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 23;
            } else {
                System.arraycopy(this.CNT_Z, 0, RomulusEngine.this.m_aad, 0, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 7, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 7;
            }
            byte[] bArr8 = this.f33132h;
            bArr8[0] = (byte) (bArr8[0] ^ 2);
            RomulusEngine.hirose_128_128_256(bArr8, this.f33131g, RomulusEngine.this.m_aad, 0);
            System.arraycopy(this.f33132h, 0, this.LR, 0, 16);
            System.arraycopy(this.f33131g, 0, this.LR, 16, 16);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine10 = RomulusEngine.this;
            romulusEngine10.block_cipher(this.LR, romulusEngine10.f33128k, this.LR, 16, this.CNT_Z, (byte) 68);
            byte[] bArr9 = this.LR;
            RomulusEngine romulusEngine11 = RomulusEngine.this;
            System.arraycopy(bArr9, 0, romulusEngine11.mac, 0, romulusEngine11.MAC_SIZE);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f33132h);
            Arrays.clear(this.f33131g);
            Arrays.clear(this.LR);
            Arrays.clear(this.T);
            Arrays.clear(this.S);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            System.arraycopy(RomulusEngine.this.npub, 0, this.Z, 0, RomulusEngine.this.IV_SIZE);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.Z, romulusEngine2.f33128k, this.T, 0, this.CNT_Z, (byte) 66);
            RomulusEngine.this.reset_lfsr_gf56(this.CNT_Z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RomulusEngine(org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 16
            r3.AADBufferSize = r0
            r3.BlockSize = r0
            r3.MAC_SIZE = r0
            r3.IV_SIZE = r0
            r3.KEY_SIZE = r0
            r0 = 7
            byte[] r0 = new byte[r0]
            r3.CNT = r0
            int r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.access$000(r4)
            if (r0 == 0) goto L3c
            r1 = 1
            if (r0 == r1) goto L32
            r1 = 2
            if (r0 == r1) goto L21
            goto L46
        L21:
            java.lang.String r0 = "Romulus-T"
            r3.algorithmName = r0
            r0 = 32
            r3.AADBufferSize = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusT r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusT
            r1 = 0
            r0.<init>()
        L2f:
            r3.instance = r0
            goto L46
        L32:
            java.lang.String r0 = "Romulus-N"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusN r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusN
            r0.<init>()
            goto L2f
        L3c:
            java.lang.String r0 = "Romulus-M"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusM r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusM
            r0.<init>()
            goto L2f
        L46:
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusN
            if (r4 != r0) goto L4d
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Buffered
            goto L4f
        L4d:
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Immediate
        L4f:
            org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType r1 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.Counter
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r2 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusM
            if (r4 != r2) goto L58
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Stream
            goto L5a
        L58:
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Counter
        L5a:
            r3.setInnerMembers(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.<init>(org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters):void");
    }

    public static void hirose_128_128_256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[48];
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        bArr2[0] = (byte) (bArr2[0] ^ 1);
        System.arraycopy(bArr3, i11, bArr4, 16, 32);
        skinny_128_384_plus_enc(bArr, bArr4);
        skinny_128_384_plus_enc(bArr2, bArr4);
        for (int i12 = 0; i12 < 16; i12++) {
            bArr[i12] = (byte) (bArr[i12] ^ bArr5[i12]);
            bArr2[i12] = (byte) (bArr2[i12] ^ bArr5[i12]);
        }
        bArr2[0] = (byte) (bArr2[0] ^ 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset_lfsr_gf56(byte[] bArr) {
        bArr[0] = 1;
        Arrays.fill(bArr, 1, 7, (byte) 0);
    }

    private static void skinny_128_384_plus_enc(byte[] bArr, byte[] bArr2) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 << 2;
            System.arraycopy(bArr, i12, bArr3[i11], 0, 4);
            System.arraycopy(bArr2, i12, bArr4[0][i11], 0, 4);
            System.arraycopy(bArr2, i12 + 16, bArr4[1][i11], 0, 4);
            System.arraycopy(bArr2, i12 + 32, bArr4[2][i11], 0, 4);
        }
        for (int i13 = 0; i13 < 40; i13++) {
            for (int i14 = 0; i14 < 4; i14++) {
                for (int i15 = 0; i15 < 4; i15++) {
                    byte[] bArr6 = bArr3[i14];
                    bArr6[i15] = sbox_8[bArr6[i15] & 255];
                }
            }
            byte[] bArr7 = bArr3[0];
            byte b8 = bArr7[0];
            byte[] bArr8 = RC;
            bArr7[0] = (byte) (b8 ^ (bArr8[i13] & 15));
            byte[] bArr9 = bArr3[1];
            bArr9[0] = (byte) (bArr9[0] ^ ((bArr8[i13] >>> 4) & 3));
            byte[] bArr10 = bArr3[2];
            bArr10[0] = (byte) (bArr10[0] ^ 2);
            for (int i16 = 0; i16 <= 1; i16++) {
                for (int i17 = 0; i17 < 4; i17++) {
                    byte[] bArr11 = bArr3[i16];
                    bArr11[i17] = (byte) (bArr11[i17] ^ ((bArr4[0][i16][i17] ^ bArr4[1][i16][i17]) ^ bArr4[2][i16][i17]));
                }
            }
            for (int i18 = 0; i18 < 4; i18++) {
                for (int i19 = 0; i19 < 4; i19++) {
                    byte b11 = TWEAKEY_P[(i18 << 2) + i19];
                    int i21 = b11 >>> 2;
                    int i22 = b11 & 3;
                    bArr5[0][i18][i19] = bArr4[0][i21][i22];
                    bArr5[1][i18][i19] = bArr4[1][i21][i22];
                    bArr5[2][i18][i19] = bArr4[2][i21][i22];
                }
            }
            int i23 = 0;
            while (i23 <= 1) {
                for (int i24 = 0; i24 < 4; i24++) {
                    bArr4[0][i23][i24] = bArr5[0][i23][i24];
                    byte b12 = bArr5[1][i23][i24];
                    bArr4[1][i23][i24] = (byte) (((b12 >>> 5) & 1) ^ (((b12 << 1) & 254) ^ ((b12 >>> 7) & 1)));
                    byte b13 = bArr5[2][i23][i24];
                    bArr4[2][i23][i24] = (byte) (((b13 << 1) & 128) ^ (((b13 >>> 1) & 127) ^ ((b13 << 7) & 128)));
                }
                i23++;
            }
            while (i23 < 4) {
                for (int i25 = 0; i25 < 4; i25++) {
                    bArr4[0][i23][i25] = bArr5[0][i23][i25];
                    bArr4[1][i23][i25] = bArr5[1][i23][i25];
                    bArr4[2][i23][i25] = bArr5[2][i23][i25];
                }
                i23++;
            }
            byte[] bArr12 = bArr3[1];
            byte b14 = bArr12[3];
            bArr12[3] = bArr12[2];
            bArr12[2] = bArr12[1];
            bArr12[1] = bArr12[0];
            bArr12[0] = b14;
            byte[] bArr13 = bArr3[2];
            byte b15 = bArr13[0];
            bArr13[0] = bArr13[2];
            bArr13[2] = b15;
            byte b16 = bArr13[1];
            bArr13[1] = bArr13[3];
            bArr13[3] = b16;
            byte[] bArr14 = bArr3[3];
            byte b17 = bArr14[0];
            bArr14[0] = bArr14[1];
            bArr14[1] = bArr14[2];
            bArr14[2] = bArr14[3];
            bArr14[3] = b17;
            for (int i26 = 0; i26 < 4; i26++) {
                byte[] bArr15 = bArr3[1];
                byte b18 = bArr15[i26];
                byte[] bArr16 = bArr3[2];
                bArr15[i26] = (byte) (b18 ^ bArr16[i26]);
                byte b19 = bArr16[i26];
                byte[] bArr17 = bArr3[0];
                byte b21 = (byte) (b19 ^ bArr17[i26]);
                bArr16[i26] = b21;
                byte[] bArr18 = bArr3[3];
                byte b22 = (byte) (bArr18[i26] ^ b21);
                bArr18[i26] = b22;
                bArr18[i26] = bArr16[i26];
                bArr16[i26] = bArr15[i26];
                bArr15[i26] = bArr17[i26];
                bArr17[i26] = b22;
            }
        }
        for (int i27 = 0; i27 < 16; i27++) {
            bArr[i27] = (byte) (bArr3[i27 >>> 2][i27 & 3] & 255);
        }
    }

    public void block_cipher(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, byte b8) {
        byte[] bArr5 = new byte[48];
        System.arraycopy(bArr4, 0, bArr5, 0, 7);
        bArr5[7] = b8;
        System.arraycopy(bArr3, i11, bArr5, 16, 16);
        System.arraycopy(bArr2, 0, bArr5, 32, 16);
        skinny_128_384_plus_enc(bArr, bArr5);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        finishAAD1(state);
    }

    public void g8A(byte[] bArr, byte[] bArr2, int i11) {
        int iMin = Math.min(bArr2.length - i11, 16);
        for (int i12 = 0; i12 < iMin; i12++) {
            byte b8 = bArr[i12];
            bArr2[i12 + i11] = (byte) (((b8 & 1) << 7) ^ (((b8 & 255) >>> 1) ^ (b8 & ByteCompanionObject.MIN_VALUE)));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i11) {
        return super.getOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i11) {
        return super.getUpdateOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        this.f33128k = bArr;
    }

    public void lfsr_gf56(byte[] bArr) {
        byte b8 = bArr[6];
        byte b11 = (byte) ((b8 & 255) >>> 7);
        byte b12 = bArr[5];
        bArr[6] = (byte) (((b8 & 255) << 1) | ((b12 & 255) >>> 7));
        int i11 = (b12 & 255) << 1;
        byte b13 = bArr[4];
        bArr[5] = (byte) (i11 | ((b13 & 255) >>> 7));
        int i12 = (b13 & 255) << 1;
        byte b14 = bArr[3];
        bArr[4] = (byte) (i12 | ((b14 & 255) >>> 7));
        int i13 = (b14 & 255) << 1;
        byte b15 = bArr[2];
        bArr[3] = (byte) (i13 | ((b15 & 255) >>> 7));
        byte b16 = bArr[1];
        bArr[2] = (byte) (((b15 & 255) << 1) | ((b16 & 255) >>> 7));
        int i14 = (b16 & 255) << 1;
        byte b17 = bArr[0];
        bArr[1] = (byte) (i14 | ((b17 & 255) >>> 7));
        int i15 = (b17 & 255) << 1;
        if (b11 == 1) {
            bArr[0] = (byte) (i15 ^ 149);
        } else {
            bArr[0] = (byte) i15;
        }
    }

    public void pad(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        bArr2[i12 - 1] = (byte) (i13 & 15);
        System.arraycopy(bArr, i11, bArr2, 0, i13);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b8) {
        super.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i11, int i12) {
        super.processAADBytes(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
        this.instance.processBufferAAD(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.instance.processBufferDecrypt(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.instance.processBufferEncrypt(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        return super.processByte(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        return super.processBytes(bArr, i11, i12, bArr2, i13);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        this.instance.processFinalAAD();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        this.instance.processFinalBlock(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        this.instance.reset();
    }

    public void rho(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        int i14;
        byte[] bArr4 = new byte[16];
        pad(bArr, i11, bArr4, 16, i13);
        g8A(bArr3, bArr2, i12);
        if (this.forEncryption) {
            for (int i15 = 0; i15 < 16; i15++) {
                bArr3[i15] = (byte) (bArr3[i15] ^ bArr4[i15]);
                int i16 = i15 + i12;
                if (i15 < i13) {
                    bArr2[i16] = (byte) (bArr2[i16] ^ bArr4[i15]);
                } else {
                    bArr2[i16] = 0;
                }
            }
            return;
        }
        for (int i17 = 0; i17 < 16; i17++) {
            byte b8 = (byte) (bArr3[i17] ^ bArr4[i17]);
            bArr3[i17] = b8;
            if (i17 < i13 && (i14 = i17 + i12) < bArr2.length) {
                bArr3[i17] = (byte) (b8 ^ bArr2[i14]);
                bArr2[i14] = (byte) (bArr2[i14] ^ bArr4[i17]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void hirose_128_128_256(RomulusDigest.Friend friend, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        if (friend != null) {
            hirose_128_128_256(bArr, bArr2, bArr3, i11);
        } else {
            w.l("This method is only for use by RomulusDigest");
        }
    }

    public class RomulusM implements Instance {
        private int offset;
        private final byte[] mac_s = new byte[16];
        private final byte[] mac_CNT = new byte[7];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final byte[] f33129s = new byte[16];
        private boolean twist = true;

        public RomulusM() {
        }

        public int ad_encryption(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, int i12, byte[] bArr4) {
            byte[] bArr5 = new byte[16];
            byte[] bArr6 = new byte[16];
            int iMin = Math.min(i12, 16);
            int i13 = i12 - iMin;
            RomulusEngine.this.pad(bArr, i11, bArr6, 16, iMin);
            Bytes.xorTo(16, bArr6, bArr2);
            int i14 = i11 + iMin;
            this.offset = i14;
            RomulusEngine.this.lfsr_gf56(bArr4);
            if (i13 == 0) {
                return i13;
            }
            int iMin2 = Math.min(i13, 16);
            int i15 = i13 - iMin2;
            RomulusEngine.this.pad(bArr, i14, bArr5, 16, iMin2);
            this.offset = i14 + iMin2;
            RomulusEngine.this.block_cipher(bArr2, bArr3, bArr5, 0, bArr4, (byte) 44);
            RomulusEngine.this.lfsr_gf56(bArr4);
            return i15;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i11) {
            boolean z11 = this.twist;
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (z11) {
                Bytes.xorTo(romulusEngine.MAC_SIZE, bArr, i11, this.mac_s);
            } else {
                romulusEngine.block_cipher(this.mac_s, romulusEngine.f33128k, bArr, i11, this.mac_CNT, (byte) 40);
            }
            this.twist = !this.twist;
            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            int len = RomulusEngine.this.aadOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (len == 0) {
                romulusEngine.lfsr_gf56(this.mac_CNT);
            } else {
                int i11 = romulusEngine.m_aadPos;
                if (i11 != 0) {
                    Arrays.fill(romulusEngine.m_aad, i11, romulusEngine.BlockSize - 1, (byte) 0);
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    byte[] bArr = romulusEngine2.m_aad;
                    int i12 = romulusEngine2.BlockSize;
                    bArr[i12 - 1] = (byte) (romulusEngine2.m_aadPos & 15);
                    boolean z11 = this.twist;
                    byte[] bArr2 = this.mac_s;
                    if (z11) {
                        Bytes.xorTo(i12, bArr, bArr2);
                    } else {
                        romulusEngine2.block_cipher(bArr2, romulusEngine2.f33128k, RomulusEngine.this.m_aad, 0, this.mac_CNT, (byte) 40);
                    }
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                }
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.m_aadPos = 0;
            romulusEngine3.m_bufPos = romulusEngine3.dataOperator.getLen();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void processFinalBlock(byte[] r31, int r32) {
            /*
                Method dump skipped, instruction units count: 499
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.RomulusM.processFinalBlock(byte[], int):void");
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.f33129s);
            Arrays.clear(this.mac_s);
            RomulusEngine.this.reset_lfsr_gf56(this.mac_CNT);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        }
    }
}
