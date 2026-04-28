package org.bouncycastle.pqc.asn1;

import j4.s;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.legacy.crypto.gmss.Treehash;

/* JADX INFO: loaded from: classes3.dex */
public class GMSSPrivateKey extends ASN1Object {
    private ASN1Primitive primitive;

    private GMSSPrivateKey(ASN1Sequence aSN1Sequence) {
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
        int[] iArr = new int[aSN1Sequence2.size()];
        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
            iArr[i11] = checkBigIntegerInIntRange(aSN1Sequence2.getObjectAt(i11));
        }
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        int size = aSN1Sequence3.size();
        byte[][] bArr = new byte[size][];
        for (int i12 = 0; i12 < size; i12++) {
            bArr[i12] = ((DEROctetString) aSN1Sequence3.getObjectAt(i12)).getOctets();
        }
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        int size2 = aSN1Sequence4.size();
        byte[][] bArr2 = new byte[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            bArr2[i13] = ((DEROctetString) aSN1Sequence4.getObjectAt(i13)).getOctets();
        }
        ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        int size3 = aSN1Sequence5.size();
        byte[][][] bArr3 = new byte[size3][][];
        for (int i14 = 0; i14 < size3; i14++) {
            ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i14);
            bArr3[i14] = new byte[aSN1Sequence6.size()][];
            int i15 = 0;
            while (true) {
                byte[][] bArr4 = bArr3[i14];
                if (i15 < bArr4.length) {
                    bArr4[i15] = ((DEROctetString) aSN1Sequence6.getObjectAt(i15)).getOctets();
                    i15++;
                }
            }
        }
        ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Sequence.getObjectAt(4);
        int size4 = aSN1Sequence7.size();
        byte[][][] bArr5 = new byte[size4][][];
        for (int i16 = 0; i16 < size4; i16++) {
            ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i16);
            bArr5[i16] = new byte[aSN1Sequence8.size()][];
            int i17 = 0;
            while (true) {
                byte[][] bArr6 = bArr5[i16];
                if (i17 < bArr6.length) {
                    bArr6[i17] = ((DEROctetString) aSN1Sequence8.getObjectAt(i17)).getOctets();
                    i17++;
                }
            }
        }
        Treehash[][] treehashArr = new Treehash[((ASN1Sequence) aSN1Sequence.getObjectAt(5)).size()][];
    }

    private static int checkBigIntegerInIntRange(ASN1Encodable aSN1Encodable) {
        return ((ASN1Integer) aSN1Encodable).intValueExact();
    }

    private ASN1Primitive encode(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, byte[][][] bArr5, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier[] algorithmIdentifierArr) {
        int[] iArr3 = iArr;
        Treehash[][] treehashArr3 = treehashArr;
        Treehash[][] treehashArr4 = treehashArr2;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i11 = 0;
        while (i11 < iArr3.length) {
            aSN1EncodableVector2.add(new ASN1Integer(iArr[i11]));
            i11++;
            iArr3 = iArr;
        }
        ASN1EncodableVector aSN1EncodableVectorV = s.v(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVectorV.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector aSN1EncodableVectorV2 = s.v(aSN1EncodableVectorV, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVectorV2.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector aSN1EncodableVectorV3 = s.v(aSN1EncodableVectorV2, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i12 = 0; i12 < bArr3.length; i12++) {
            for (int i13 = 0; i13 < bArr3[i12].length; i13++) {
                aSN1EncodableVectorV3.add(new DEROctetString(bArr3[i12][i13]));
            }
            aSN1EncodableVectorV3 = s.v(aSN1EncodableVectorV3, aSN1EncodableVector3);
        }
        ASN1EncodableVector aSN1EncodableVectorV4 = s.v(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (int i14 = 0; i14 < bArr4.length; i14++) {
            for (int i15 = 0; i15 < bArr4[i14].length; i15++) {
                aSN1EncodableVectorV4.add(new DEROctetString(bArr4[i14][i15]));
            }
            aSN1EncodableVectorV4 = s.v(aSN1EncodableVectorV4, aSN1EncodableVector4);
        }
        ASN1EncodableVector aSN1EncodableVectorV5 = s.v(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        int i16 = 0;
        while (i16 < treehashArr3.length) {
            int i17 = 0;
            while (i17 < treehashArr3[i16].length) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i18 = treehashArr3[i16][i17].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i16][i17].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i16][i17].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i16][i17].getStatByte()[2]));
                int i19 = 0;
                while (i19 < i18) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr3[i16][i17].getStatByte()[i19 + 3]));
                    i19++;
                    treehashArr3 = treehashArr;
                }
                aSN1EncodableVector7 = s.v(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i18));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[5]));
                int i21 = 0;
                while (i21 < i18) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i16][i17].getStatInt()[i21 + 6]));
                    i21++;
                    i16 = i16;
                    i17 = i17;
                }
                aSN1EncodableVector8 = s.v(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = s.v(aSN1EncodableVector6, aSN1EncodableVector5);
                i17++;
                treehashArr3 = treehashArr;
            }
            aSN1EncodableVector5 = s.v(aSN1EncodableVector5, aSN1EncodableVectorV5);
            i16++;
            treehashArr3 = treehashArr;
        }
        ASN1EncodableVector aSN1EncodableVectorV6 = s.v(aSN1EncodableVectorV5, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        int i22 = 0;
        while (i22 < treehashArr4.length) {
            int i23 = 0;
            while (i23 < treehashArr4[i22].length) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i24 = treehashArr4[i22][i23].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i22][i23].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i22][i23].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i22][i23].getStatByte()[2]));
                for (int i25 = 0; i25 < i24; i25++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr4[i22][i23].getStatByte()[i25 + 3]));
                }
                aSN1EncodableVector11 = s.v(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i24));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[5]));
                int i26 = 0;
                while (i26 < i24) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr4[i22][i23].getStatInt()[i26 + 6]));
                    i26++;
                    treehashArr4 = treehashArr2;
                    i22 = i22;
                }
                aSN1EncodableVector12 = s.v(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = s.v(aSN1EncodableVector10, aSN1EncodableVector9);
                i23++;
                treehashArr4 = treehashArr2;
            }
            aSN1EncodableVectorV6.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
            i22++;
            treehashArr4 = treehashArr2;
        }
        ASN1EncodableVector aSN1EncodableVectorV7 = s.v(aSN1EncodableVectorV6, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (int i27 = 0; i27 < bArr5.length; i27++) {
            for (int i28 = 0; i28 < bArr5[i27].length; i28++) {
                aSN1EncodableVectorV7.add(new DEROctetString(bArr5[i27][i28]));
            }
            aSN1EncodableVectorV7 = s.v(aSN1EncodableVectorV7, aSN1EncodableVector13);
        }
        ASN1EncodableVector aSN1EncodableVectorV8 = s.v(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i29 = 0; i29 < vectorArr.length; i29++) {
            for (int i31 = 0; i31 < vectorArr[i29].size(); i31++) {
                aSN1EncodableVectorV8.add(new DEROctetString((byte[]) vectorArr[i29].elementAt(i31)));
            }
            aSN1EncodableVectorV8 = s.v(aSN1EncodableVectorV8, aSN1EncodableVector14);
        }
        ASN1EncodableVector aSN1EncodableVectorV9 = s.v(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i32 = 0; i32 < vectorArr2.length; i32++) {
            for (int i33 = 0; i33 < vectorArr2[i32].size(); i33++) {
                aSN1EncodableVectorV9.add(new DEROctetString((byte[]) vectorArr2[i32].elementAt(i33)));
            }
            aSN1EncodableVectorV9 = s.v(aSN1EncodableVectorV9, aSN1EncodableVector15);
        }
        ASN1EncodableVector aSN1EncodableVectorV10 = s.v(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i34 = 0; i34 < vectorArr3.length; i34++) {
            for (int i35 = 0; i35 < vectorArr3[i34].length; i35++) {
                for (int i36 = 0; i36 < vectorArr3[i34][i35].size(); i36++) {
                    aSN1EncodableVectorV10.add(new DEROctetString((byte[]) vectorArr3[i34][i35].elementAt(i36)));
                }
                aSN1EncodableVectorV10 = s.v(aSN1EncodableVectorV10, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = s.v(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector aSN1EncodableVectorV11 = s.v(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i37 = 0; i37 < vectorArr4.length; i37++) {
            for (int i38 = 0; i38 < vectorArr4[i37].length; i38++) {
                for (int i39 = 0; i39 < vectorArr4[i37][i38].size(); i39++) {
                    aSN1EncodableVectorV11.add(new DEROctetString((byte[]) vectorArr4[i37][i38].elementAt(i39)));
                }
                aSN1EncodableVectorV11 = s.v(aSN1EncodableVectorV11, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = s.v(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector aSN1EncodableVectorV12 = s.v(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i41 = 0; i41 < gMSSLeafArr.length; i41++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i41].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i41].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = s.v(aSN1EncodableVector20, aSN1EncodableVectorV12);
        }
        ASN1EncodableVector aSN1EncodableVectorV13 = s.v(aSN1EncodableVectorV12, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i42 = 0; i42 < gMSSLeafArr2.length; i42++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i42].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i42].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = s.v(aSN1EncodableVector23, aSN1EncodableVectorV13);
        }
        ASN1EncodableVector aSN1EncodableVectorV14 = s.v(aSN1EncodableVectorV13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        for (int i43 = 0; i43 < gMSSLeafArr3.length; i43++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i43].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i43].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = s.v(aSN1EncodableVector26, aSN1EncodableVectorV14);
        }
        ASN1EncodableVector aSN1EncodableVectorV15 = s.v(aSN1EncodableVectorV14, aSN1EncodableVector);
        for (int i44 : iArr2) {
            aSN1EncodableVectorV15.add(new ASN1Integer(i44));
        }
        ASN1EncodableVector aSN1EncodableVectorV16 = s.v(aSN1EncodableVectorV15, aSN1EncodableVector);
        for (byte[] bArr10 : bArr6) {
            aSN1EncodableVectorV16.add(new DEROctetString(bArr10));
        }
        ASN1EncodableVector aSN1EncodableVectorV17 = s.v(aSN1EncodableVectorV16, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        int i45 = 0;
        while (i45 < gMSSRootCalcArr.length) {
            aSN1EncodableVector29.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i46 = gMSSRootCalcArr[i45].getStatInt()[0];
            int i47 = gMSSRootCalcArr[i45].getStatInt()[7];
            aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i45].getStatByte()[0]));
            int i48 = 0;
            while (i48 < i46) {
                i48++;
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i45].getStatByte()[i48]));
            }
            for (int i49 = 0; i49 < i47; i49++) {
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i45].getStatByte()[i46 + 1 + i49]));
            }
            ASN1EncodableVector aSN1EncodableVectorV18 = s.v(aSN1EncodableVector30, aSN1EncodableVector29);
            aSN1EncodableVector31.add(new ASN1Integer(i46));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[1]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[2]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[3]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[4]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[5]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[6]));
            aSN1EncodableVector31.add(new ASN1Integer(i47));
            for (int i51 = 0; i51 < i46; i51++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[i51 + 8]));
            }
            for (int i52 = 0; i52 < i47; i52++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i45].getStatInt()[i46 + 8 + i52]));
            }
            ASN1EncodableVector aSN1EncodableVectorV19 = s.v(aSN1EncodableVector31, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector34 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i45].getTreehash() != null) {
                int i53 = 0;
                while (i53 < gMSSRootCalcArr[i45].getTreehash().length) {
                    aSN1EncodableVector34.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i54 = gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[1];
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i45].getTreehash()[i53].getStatByte()[0]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i45].getTreehash()[i53].getStatByte()[1]));
                    aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i45].getTreehash()[i53].getStatByte()[2]));
                    int i55 = 0;
                    while (i55 < i54) {
                        aSN1EncodableVector35.add(new DEROctetString(gMSSRootCalcArr[i45].getTreehash()[i53].getStatByte()[i55 + 3]));
                        i55++;
                        aSN1EncodableVectorV18 = aSN1EncodableVectorV18;
                    }
                    ASN1EncodableVector aSN1EncodableVector37 = aSN1EncodableVectorV18;
                    aSN1EncodableVector35 = s.v(aSN1EncodableVector35, aSN1EncodableVector34);
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[0]));
                    aSN1EncodableVector36.add(new ASN1Integer(i54));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[2]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[3]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[4]));
                    aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[5]));
                    int i56 = 0;
                    while (i56 < i54) {
                        aSN1EncodableVector36.add(new ASN1Integer(gMSSRootCalcArr[i45].getTreehash()[i53].getStatInt()[i56 + 6]));
                        i56++;
                        aSN1EncodableVectorV19 = aSN1EncodableVectorV19;
                    }
                    aSN1EncodableVector36 = s.v(aSN1EncodableVector36, aSN1EncodableVector34);
                    aSN1EncodableVector34 = s.v(aSN1EncodableVector34, aSN1EncodableVector32);
                    i53++;
                    aSN1EncodableVectorV18 = aSN1EncodableVector37;
                }
            }
            ASN1EncodableVector aSN1EncodableVector38 = aSN1EncodableVectorV18;
            ASN1EncodableVector aSN1EncodableVector39 = aSN1EncodableVectorV19;
            aSN1EncodableVector32 = s.v(aSN1EncodableVector32, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector40 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i45].getRetain() != null) {
                for (int i57 = 0; i57 < gMSSRootCalcArr[i45].getRetain().length; i57++) {
                    for (int i58 = 0; i58 < gMSSRootCalcArr[i45].getRetain()[i57].size(); i58++) {
                        aSN1EncodableVector40.add(new DEROctetString((byte[]) gMSSRootCalcArr[i45].getRetain()[i57].elementAt(i58)));
                    }
                    aSN1EncodableVector40 = s.v(aSN1EncodableVector40, aSN1EncodableVector33);
                }
            }
            aSN1EncodableVector33 = s.v(aSN1EncodableVector33, aSN1EncodableVector29);
            aSN1EncodableVector29 = s.v(aSN1EncodableVector29, aSN1EncodableVectorV17);
            i45++;
            aSN1EncodableVector30 = aSN1EncodableVector38;
            aSN1EncodableVector31 = aSN1EncodableVector39;
        }
        ASN1EncodableVector aSN1EncodableVectorV20 = s.v(aSN1EncodableVectorV17, aSN1EncodableVector);
        for (byte[] bArr11 : bArr7) {
            aSN1EncodableVectorV20.add(new DEROctetString(bArr11));
        }
        ASN1EncodableVector aSN1EncodableVectorV21 = s.v(aSN1EncodableVectorV20, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector42 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        for (int i59 = 0; i59 < gMSSRootSigArr.length; i59++) {
            aSN1EncodableVector41.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i59].getStatByte()[0]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i59].getStatByte()[1]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i59].getStatByte()[2]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i59].getStatByte()[3]));
            aSN1EncodableVector42.add(new DEROctetString(gMSSRootSigArr[i59].getStatByte()[4]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector42));
            aSN1EncodableVector42 = new ASN1EncodableVector();
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[0]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[1]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[2]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[3]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[4]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[5]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[6]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[7]));
            aSN1EncodableVector43.add(new ASN1Integer(gMSSRootSigArr[i59].getStatInt()[8]));
            aSN1EncodableVector41.add(new DERSequence(aSN1EncodableVector43));
            aSN1EncodableVector43 = new ASN1EncodableVector();
            aSN1EncodableVector41 = s.v(aSN1EncodableVector41, aSN1EncodableVectorV21);
        }
        ASN1EncodableVector aSN1EncodableVectorV22 = s.v(aSN1EncodableVectorV21, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        for (int i61 = 0; i61 < gMSSParameters.getHeightOfTrees().length; i61++) {
            aSN1EncodableVector44.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i61]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i61]));
            aSN1EncodableVector46.add(new ASN1Integer(gMSSParameters.getK()[i61]));
        }
        aSN1EncodableVectorV22.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVectorV22.add(new DERSequence(aSN1EncodableVector44));
        aSN1EncodableVectorV22.add(new DERSequence(aSN1EncodableVector45));
        aSN1EncodableVectorV22.add(new DERSequence(aSN1EncodableVector46));
        ASN1EncodableVector aSN1EncodableVectorV23 = s.v(aSN1EncodableVectorV22, aSN1EncodableVector);
        for (AlgorithmIdentifier algorithmIdentifier : algorithmIdentifierArr) {
            aSN1EncodableVectorV23.add(algorithmIdentifier);
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVectorV23));
        return new DERSequence(aSN1EncodableVector);
    }

    public static GMSSPrivateKey getInstance(Object obj) {
        if (obj instanceof GMSSPrivateKey) {
            return (GMSSPrivateKey) obj;
        }
        if (obj != null) {
            return new GMSSPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.primitive;
    }

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        this.primitive = encode(iArr, bArr, bArr2, bArr3, bArr4, bArr5, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, gMSSLeafArr, gMSSLeafArr2, gMSSLeafArr3, iArr2, bArr6, gMSSRootCalcArr, bArr7, gMSSRootSigArr, gMSSParameters, new AlgorithmIdentifier[]{algorithmIdentifier});
    }
}
