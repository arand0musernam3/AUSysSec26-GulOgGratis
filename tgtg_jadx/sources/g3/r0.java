package g3;

import com.appsflyer.attribution.RequestError;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f19375a = new m3.d3(new fw.b(14));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m3.d3 f19376b = new m3.d3(new fw.b(15));

    public static final long a(p0 p0Var, long j9) {
        long j11 = p0Var.f19258a;
        long j12 = p0Var.U;
        long j13 = p0Var.Q;
        long j14 = p0Var.M;
        long j15 = p0Var.f19282q;
        if (i4.v.c(j9, j11)) {
            return p0Var.f19260b;
        }
        if (i4.v.c(j9, p0Var.f19268f)) {
            return p0Var.f19270g;
        }
        if (i4.v.c(j9, p0Var.f19276j)) {
            return p0Var.f19277k;
        }
        if (i4.v.c(j9, p0Var.f19279n)) {
            return p0Var.f19280o;
        }
        if (i4.v.c(j9, p0Var.f19288w)) {
            return p0Var.f19289x;
        }
        if (i4.v.c(j9, p0Var.f19262c)) {
            return p0Var.f19264d;
        }
        if (i4.v.c(j9, p0Var.f19272h)) {
            return p0Var.f19274i;
        }
        if (i4.v.c(j9, p0Var.l)) {
            return p0Var.f19278m;
        }
        if (i4.v.c(j9, p0Var.f19290y)) {
            return p0Var.f19291z;
        }
        if (i4.v.c(j9, p0Var.f19286u)) {
            return p0Var.f19287v;
        }
        if (i4.v.c(j9, p0Var.f19281p)) {
            return j15;
        }
        if (i4.v.c(j9, p0Var.f19283r)) {
            return p0Var.f19284s;
        }
        if (i4.v.c(j9, p0Var.D) || i4.v.c(j9, p0Var.F) || i4.v.c(j9, p0Var.G) || i4.v.c(j9, p0Var.H) || i4.v.c(j9, p0Var.I) || i4.v.c(j9, p0Var.J) || i4.v.c(j9, p0Var.E)) {
            return j15;
        }
        if (i4.v.c(j9, p0Var.K) || i4.v.c(j9, p0Var.L)) {
            return j14;
        }
        if (i4.v.c(j9, p0Var.O) || i4.v.c(j9, p0Var.P)) {
            return j13;
        }
        if (i4.v.c(j9, p0Var.S) || i4.v.c(j9, p0Var.T)) {
            return j12;
        }
        int i11 = i4.v.f23316i;
        return i4.v.f23315h;
    }

    public static final long b(long j9, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.a0(89373914);
        long jA = a((p0) sVar.j(f19375a), j9);
        if (jA == 16) {
            jA = ((i4.v) sVar.j(v0.f19606a)).f23317a;
        }
        sVar.q(false);
        return jA;
    }

    public static p0 c(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j61, long j62, int i11, int i12) {
        long j63 = (i11 & 1) != 0 ? l3.p.f27092z : j9;
        long j64 = (i11 & 2) != 0 ? l3.p.f27077j : j11;
        long j65 = (i11 & 4) != 0 ? l3.p.A : j12;
        long j66 = (i11 & 8) != 0 ? l3.p.f27078k : j13;
        long j67 = (i11 & 16) != 0 ? l3.p.f27072e : j14;
        long j68 = (i11 & 32) != 0 ? l3.p.E : j15;
        long j69 = (i11 & 64) != 0 ? l3.p.f27080n : j16;
        long j71 = j63;
        long j72 = (i11 & 128) != 0 ? l3.p.F : j17;
        long j73 = (i11 & 256) != 0 ? l3.p.f27081o : j18;
        long j74 = (i11 & 512) != 0 ? l3.p.R : j19;
        long j75 = (i11 & 1024) != 0 ? l3.p.f27086t : j21;
        long j76 = (i11 & NewHope.SENDB_BYTES) != 0 ? l3.p.S : j22;
        long j77 = (i11 & 4096) != 0 ? l3.p.f27087u : j23;
        long j78 = (i11 & 8192) != 0 ? l3.p.f27068a : j24;
        long j79 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? l3.p.f27074g : j25;
        long j81 = (i11 & 32768) != 0 ? l3.p.I : j26;
        long j82 = (i11 & 65536) != 0 ? l3.p.f27084r : j27;
        long j83 = (i11 & 131072) != 0 ? l3.p.Q : j28;
        long j84 = (i11 & 262144) != 0 ? l3.p.f27085s : j29;
        long j85 = (i11 & 524288) != 0 ? j71 : j31;
        long j86 = (i11 & 1048576) != 0 ? l3.p.f27073f : j32;
        long j87 = (i11 & 2097152) != 0 ? l3.p.f27071d : j33;
        long j88 = (i11 & 4194304) != 0 ? l3.p.f27069b : j34;
        long j89 = (i11 & 8388608) != 0 ? l3.p.f27075h : j35;
        long j90 = (i11 & 16777216) != 0 ? l3.p.f27070c : j36;
        long j91 = (i11 & 33554432) != 0 ? l3.p.f27076i : j37;
        long j92 = (i11 & 67108864) != 0 ? l3.p.f27090x : j38;
        long j93 = (i11 & 134217728) != 0 ? l3.p.f27091y : j39;
        long j94 = (i11 & 268435456) != 0 ? l3.p.D : j41;
        long j95 = (i11 & 536870912) != 0 ? l3.p.J : j42;
        long j96 = (i11 & 1073741824) != 0 ? l3.p.K : j43;
        long j97 = (i11 & Integer.MIN_VALUE) != 0 ? l3.p.L : j44;
        long j98 = (i12 & 1) != 0 ? l3.p.M : j45;
        long j99 = (i12 & 2) != 0 ? l3.p.N : j46;
        long j100 = (i12 & 4) != 0 ? l3.p.O : j47;
        return new p0(j71, j64, j65, j66, j67, j68, j69, j72, j73, j74, j75, j76, j77, j78, j79, j81, j82, j83, j84, j85, j86, j87, j88, j89, j90, j91, j92, j93, j94, j95, (i12 & 8) != 0 ? l3.p.P : j48, j96, j97, j98, j99, j100, (i12 & 16) != 0 ? l3.p.B : j49, (i12 & 32) != 0 ? l3.p.C : j51, (i12 & 64) != 0 ? l3.p.l : j52, (i12 & 128) != 0 ? l3.p.f27079m : j53, (i12 & 256) != 0 ? l3.p.G : j54, (i12 & 512) != 0 ? l3.p.H : j55, (i12 & 1024) != 0 ? l3.p.f27082p : j56, (i12 & NewHope.SENDB_BYTES) != 0 ? l3.p.f27083q : j57, (i12 & 4096) != 0 ? l3.p.T : j58, (i12 & 8192) != 0 ? l3.p.U : j59, (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? l3.p.f27088v : j61, (i12 & 32768) != 0 ? l3.p.f27089w : j62);
    }

    public static final long d(p0 p0Var, l3.r rVar) {
        switch (q0.$EnumSwitchMapping$0[rVar.ordinal()]) {
            case 1:
                return p0Var.f19279n;
            case 2:
                return p0Var.f19288w;
            case 3:
                return p0Var.f19290y;
            case 4:
                return p0Var.f19287v;
            case 5:
                return p0Var.f19266e;
            case 6:
                return p0Var.f19286u;
            case 7:
                return p0Var.f19280o;
            case 8:
                return p0Var.f19289x;
            case 9:
                return p0Var.f19291z;
            case 10:
                return p0Var.f19260b;
            case 11:
                return p0Var.f19264d;
            case 12:
                return p0Var.f19270g;
            case 13:
                return p0Var.f19274i;
            case 14:
                return p0Var.f19282q;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return p0Var.f19284s;
            case 16:
                return p0Var.f19285t;
            case 17:
                return p0Var.f19277k;
            case 18:
                return p0Var.f19278m;
            case 19:
                return p0Var.A;
            case 20:
                return p0Var.B;
            case 21:
                return p0Var.f19258a;
            case 22:
                return p0Var.f19262c;
            case 23:
                return p0Var.C;
            case 24:
                return p0Var.f19268f;
            case 25:
                return p0Var.f19272h;
            case 26:
                return p0Var.f19281p;
            case 27:
                return p0Var.f19283r;
            case 28:
                return p0Var.D;
            case 29:
                return p0Var.F;
            case 30:
                return p0Var.G;
            case BERTags.DATE /* 31 */:
                return p0Var.H;
            case 32:
                return p0Var.I;
            case 33:
                return p0Var.J;
            case BERTags.DURATION /* 34 */:
                return p0Var.E;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                return p0Var.f19276j;
            case 36:
                return p0Var.l;
            case 37:
                return p0Var.K;
            case 38:
                return p0Var.L;
            case 39:
                return p0Var.M;
            case 40:
                return p0Var.N;
            case RequestError.NO_DEV_KEY /* 41 */:
                return p0Var.O;
            case 42:
                return p0Var.P;
            case 43:
                return p0Var.Q;
            case 44:
                return p0Var.R;
            case 45:
                return p0Var.S;
            case 46:
                return p0Var.T;
            case 47:
                return p0Var.U;
            case 48:
                return p0Var.V;
            default:
                e40.a.f();
                return 0L;
        }
    }

    public static final long e(l3.r rVar, m3.n nVar) {
        return d((p0) ((m3.s) nVar).j(f19375a), rVar);
    }

    public static p0 f(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j61, long j62, int i11, int i12) {
        long j63 = (i11 & 1) != 0 ? l3.q.f27123z : j9;
        long j64 = (i11 & 2) != 0 ? l3.q.f27108j : j11;
        long j65 = (i11 & 4) != 0 ? l3.q.A : j12;
        long j66 = (i11 & 8) != 0 ? l3.q.f27109k : j13;
        long j67 = (i11 & 16) != 0 ? l3.q.f27103e : j14;
        long j68 = (i11 & 32) != 0 ? l3.q.E : j15;
        long j69 = (i11 & 64) != 0 ? l3.q.f27111n : j16;
        long j71 = j63;
        long j72 = (i11 & 128) != 0 ? l3.q.F : j17;
        long j73 = (i11 & 256) != 0 ? l3.q.f27112o : j18;
        long j74 = (i11 & 512) != 0 ? l3.q.R : j19;
        long j75 = (i11 & 1024) != 0 ? l3.q.f27117t : j21;
        long j76 = (i11 & NewHope.SENDB_BYTES) != 0 ? l3.q.S : j22;
        long j77 = (i11 & 4096) != 0 ? l3.q.f27118u : j23;
        long j78 = (i11 & 8192) != 0 ? l3.q.f27099a : j24;
        long j79 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? l3.q.f27105g : j25;
        long j81 = (i11 & 32768) != 0 ? l3.q.I : j26;
        long j82 = (i11 & 65536) != 0 ? l3.q.f27115r : j27;
        long j83 = (i11 & 131072) != 0 ? l3.q.Q : j28;
        long j84 = (i11 & 262144) != 0 ? l3.q.f27116s : j29;
        long j85 = (i11 & 524288) != 0 ? j71 : j31;
        long j86 = (i11 & 1048576) != 0 ? l3.q.f27104f : j32;
        long j87 = (i11 & 2097152) != 0 ? l3.q.f27102d : j33;
        long j88 = (i11 & 4194304) != 0 ? l3.q.f27100b : j34;
        long j89 = (i11 & 8388608) != 0 ? l3.q.f27106h : j35;
        long j90 = (i11 & 16777216) != 0 ? l3.q.f27101c : j36;
        long j91 = (i11 & 33554432) != 0 ? l3.q.f27107i : j37;
        long j92 = (i11 & 67108864) != 0 ? l3.q.f27121x : j38;
        long j93 = (i11 & 134217728) != 0 ? l3.q.f27122y : j39;
        long j94 = (i11 & 268435456) != 0 ? l3.q.D : j41;
        long j95 = (i11 & 536870912) != 0 ? l3.q.J : j42;
        long j96 = (i11 & 1073741824) != 0 ? l3.q.K : j43;
        long j97 = (i11 & Integer.MIN_VALUE) != 0 ? l3.q.L : j44;
        long j98 = (i12 & 1) != 0 ? l3.q.M : j45;
        long j99 = (i12 & 2) != 0 ? l3.q.N : j46;
        long j100 = (i12 & 4) != 0 ? l3.q.O : j47;
        return new p0(j71, j64, j65, j66, j67, j68, j69, j72, j73, j74, j75, j76, j77, j78, j79, j81, j82, j83, j84, j85, j86, j87, j88, j89, j90, j91, j92, j93, j94, j95, (i12 & 8) != 0 ? l3.q.P : j48, j96, j97, j98, j99, j100, (i12 & 16) != 0 ? l3.q.B : j49, (i12 & 32) != 0 ? l3.q.C : j51, (i12 & 64) != 0 ? l3.q.l : j52, (i12 & 128) != 0 ? l3.q.f27110m : j53, (i12 & 256) != 0 ? l3.q.G : j54, (i12 & 512) != 0 ? l3.q.H : j55, (i12 & 1024) != 0 ? l3.q.f27113p : j56, (i12 & NewHope.SENDB_BYTES) != 0 ? l3.q.f27114q : j57, (i12 & 4096) != 0 ? l3.q.T : j58, (i12 & 8192) != 0 ? l3.q.U : j59, (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? l3.q.f27119v : j61, (i12 & 32768) != 0 ? l3.q.f27120w : j62);
    }
}
