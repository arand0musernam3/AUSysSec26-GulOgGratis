package org.bouncycastle.pqc.legacy.crypto.gmss;

import b3.i;
import e0.f;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f33667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33668j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33669w;

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f33667i = iArr[0];
        this.f33668j = iArr[1];
        this.steps = iArr[2];
        this.f33669w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / ((double) this.f33669w));
        this.keysize = iCeil + ((int) Math.ceil(((double) getLog((iCeil << this.f33669w) + 1)) / ((double) this.f33669w)));
        this.two_power_w = 1 << this.f33669w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i11 = 0; i11 < this.steps + 10000; i11++) {
            int i12 = this.f33667i;
            if (i12 == this.keysize && this.f33668j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i12 == 0 || this.f33668j == this.two_power_w - 1) {
                this.f33667i = i12 + 1;
                this.f33668j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i13 = this.f33668j + 1;
                this.f33668j = i13;
                if (i13 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i14 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f33667i - 1) * i14, i14);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f33667i + " " + this.f33668j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.f33667i, this.f33668j, this.steps, this.f33669w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f33667i = 0;
        this.f33668j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String strI = "";
        for (int i11 = 0; i11 < 4; i11++) {
            strI = k.i(getStatInt()[i11], " ", i.o(strI));
        }
        StringBuilder sbR = f.r(strI, " ");
        sbR.append(this.mdsize);
        sbR.append(" ");
        sbR.append(this.keysize);
        sbR.append(" ");
        String strI2 = k.i(this.two_power_w, " ", sbR);
        byte[][] statByte = getStatByte();
        for (int i12 = 0; i12 < 4; i12++) {
            strI2 = statByte[i12] != null ? k.p(i.o(strI2), new String(Hex.encode(statByte[i12])), " ") : strI2.concat("null ");
        }
        return strI2;
    }

    public GMSSLeaf(Digest digest, int i11, int i12, byte[] bArr) {
        this.f33669w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d3 = i11;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d3);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i11) + 1)) / d3));
        this.keysize = iCeil2;
        int i13 = 1 << i11;
        this.two_power_w = i13;
        this.steps = (int) Math.ceil(((double) ((((i13 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i12));
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, int i11, int i12) {
        this.f33669w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d3 = i11;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d3);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i11) + 1)) / d3));
        this.keysize = iCeil2;
        int i13 = 1 << i11;
        this.two_power_w = i13;
        this.steps = (int) Math.ceil(((double) ((((i13 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i12));
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f33667i = gMSSLeaf.f33667i;
        this.f33668j = gMSSLeaf.f33668j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f33669w = gMSSLeaf.f33669w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
