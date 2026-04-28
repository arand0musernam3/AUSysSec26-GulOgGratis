package a00;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109a;

    public /* synthetic */ g0(int i11) {
        this.f109a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f109a) {
            case 0:
                try {
                    return b.a(parcel.readString());
                } catch (Attachment$UnsupportedAttachmentException e5) {
                    org.bouncycastle.jce.provider.a.m(e5);
                    return null;
                }
            case 1:
                int iX = jf.e.X(parcel);
                boolean zM = false;
                while (parcel.dataPosition() < iX) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        jf.e.W(i11, parcel);
                    } else {
                        zM = jf.e.M(i11, parcel);
                    }
                }
                jf.e.B(iX, parcel);
                return new t0(zM);
            case 2:
                int iX2 = jf.e.X(parcel);
                long jT = 0;
                while (parcel.dataPosition() < iX2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        jf.e.W(i12, parcel);
                    } else {
                        jT = jf.e.T(i12, parcel);
                    }
                }
                jf.e.B(iX2, parcel);
                return new h0(jT);
            case 3:
                int iX3 = jf.e.X(parcel);
                boolean zM2 = false;
                while (parcel.dataPosition() < iX3) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        jf.e.W(i13, parcel);
                    } else {
                        zM2 = jf.e.M(i13, parcel);
                    }
                }
                jf.e.B(iX3, parcel);
                return new i0(zM2);
            case 4:
                int iX4 = jf.e.X(parcel);
                boolean zM3 = false;
                while (parcel.dataPosition() < iX4) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        jf.e.W(i14, parcel);
                    } else {
                        zM3 = jf.e.M(i14, parcel);
                    }
                }
                jf.e.B(iX4, parcel);
                return new p(zM3);
            case 5:
                int iX5 = jf.e.X(parcel);
                String strW = null;
                while (parcel.dataPosition() < iX5) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        jf.e.W(i15, parcel);
                    } else {
                        strW = jf.e.w(i15, parcel);
                    }
                }
                jf.e.B(iX5, parcel);
                return new j0(strW);
            case 6:
                int iX6 = jf.e.X(parcel);
                int iR = 0;
                byte[] bArrR = null;
                byte[] bArrR2 = null;
                byte[] bArrR3 = null;
                while (parcel.dataPosition() < iX6) {
                    int i16 = parcel.readInt();
                    char c3 = (char) i16;
                    if (c3 == 1) {
                        bArrR = jf.e.r(i16, parcel);
                    } else if (c3 == 2) {
                        bArrR2 = jf.e.r(i16, parcel);
                    } else if (c3 == 3) {
                        bArrR3 = jf.e.r(i16, parcel);
                    } else if (c3 != 4) {
                        jf.e.W(i16, parcel);
                    } else {
                        iR = jf.e.R(i16, parcel);
                    }
                }
                jf.e.B(iX6, parcel);
                return new k0(bArrR == null ? null : k00.q0.j(bArrR.length, bArrR), bArrR2 == null ? null : k00.q0.j(bArrR2.length, bArrR2), bArrR3 != null ? k00.q0.j(bArrR3.length, bArrR3) : null, iR);
            case 7:
                int iX7 = jf.e.X(parcel);
                byte[][] bArrS = null;
                while (parcel.dataPosition() < iX7) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        jf.e.W(i17, parcel);
                    } else {
                        bArrS = jf.e.s(i17, parcel);
                    }
                }
                jf.e.B(iX7, parcel);
                return new l0(bArrS);
            case 8:
                int iX8 = jf.e.X(parcel);
                v vVar = null;
                x xVar = null;
                byte[] bArrR4 = null;
                ArrayList arrayListA = null;
                Double dValueOf = null;
                ArrayList arrayListA2 = null;
                k kVar = null;
                Integer numS = null;
                b0 b0Var = null;
                String strW2 = null;
                d dVar = null;
                String strW3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iX8) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            vVar = (v) jf.e.v(parcel, i18, v.CREATOR);
                            break;
                        case 3:
                            xVar = (x) jf.e.v(parcel, i18, x.CREATOR);
                            break;
                        case 4:
                            bArrR4 = jf.e.r(i18, parcel);
                            break;
                        case 5:
                            arrayListA = jf.e.A(parcel, i18, u.CREATOR);
                            break;
                        case 6:
                            int iU = jf.e.U(i18, parcel);
                            if (iU != 0) {
                                jf.e.Z(parcel, iU, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        case 7:
                            arrayListA2 = jf.e.A(parcel, i18, t.CREATOR);
                            break;
                        case '\b':
                            kVar = (k) jf.e.v(parcel, i18, k.CREATOR);
                            break;
                        case '\t':
                            numS = jf.e.S(i18, parcel);
                            break;
                        case '\n':
                            b0Var = (b0) jf.e.v(parcel, i18, b0.CREATOR);
                            break;
                        case 11:
                            strW2 = jf.e.w(i18, parcel);
                            break;
                        case '\f':
                            dVar = (d) jf.e.v(parcel, i18, d.CREATOR);
                            break;
                        case '\r':
                            strW3 = jf.e.w(i18, parcel);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) jf.e.v(parcel, i18, ResultReceiver.CREATOR);
                            break;
                        default:
                            jf.e.W(i18, parcel);
                            break;
                    }
                }
                jf.e.B(iX8, parcel);
                return new s(vVar, xVar, bArrR4, arrayListA, dValueOf, arrayListA2, kVar, numS, b0Var, strW2, dVar, strW3, resultReceiver);
            case 9:
                int iX9 = jf.e.X(parcel);
                String strW4 = null;
                String strW5 = null;
                byte[] bArrR5 = null;
                h hVar = null;
                g gVar = null;
                i iVar = null;
                e eVar = null;
                String strW6 = null;
                while (parcel.dataPosition() < iX9) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strW4 = jf.e.w(i19, parcel);
                            break;
                        case 2:
                            strW5 = jf.e.w(i19, parcel);
                            break;
                        case 3:
                            bArrR5 = jf.e.r(i19, parcel);
                            break;
                        case 4:
                            hVar = (h) jf.e.v(parcel, i19, h.CREATOR);
                            break;
                        case 5:
                            gVar = (g) jf.e.v(parcel, i19, g.CREATOR);
                            break;
                        case 6:
                            iVar = (i) jf.e.v(parcel, i19, i.CREATOR);
                            break;
                        case 7:
                            eVar = (e) jf.e.v(parcel, i19, e.CREATOR);
                            break;
                        case '\b':
                            strW6 = jf.e.w(i19, parcel);
                            break;
                        case '\t':
                            jf.e.w(i19, parcel);
                            break;
                        default:
                            jf.e.W(i19, parcel);
                            break;
                    }
                }
                jf.e.B(iX9, parcel);
                return new q(strW4, strW5, bArrR5, hVar, gVar, iVar, eVar, strW6);
            case 10:
                int iX10 = jf.e.X(parcel);
                String strW7 = null;
                byte[] bArrR6 = null;
                ArrayList arrayListA3 = null;
                while (parcel.dataPosition() < iX10) {
                    int i21 = parcel.readInt();
                    char c7 = (char) i21;
                    if (c7 == 2) {
                        strW7 = jf.e.w(i21, parcel);
                    } else if (c7 == 3) {
                        bArrR6 = jf.e.r(i21, parcel);
                    } else if (c7 != 4) {
                        jf.e.W(i21, parcel);
                    } else {
                        arrayListA3 = jf.e.A(parcel, i21, Transport.CREATOR);
                    }
                }
                jf.e.B(iX10, parcel);
                return new t(strW7, bArrR6, arrayListA3);
            case 11:
                int iX11 = jf.e.X(parcel);
                String strW8 = null;
                Integer numS2 = null;
                while (parcel.dataPosition() < iX11) {
                    int i22 = parcel.readInt();
                    char c8 = (char) i22;
                    if (c8 == 2) {
                        strW8 = jf.e.w(i22, parcel);
                    } else if (c8 != 3) {
                        jf.e.W(i22, parcel);
                    } else {
                        numS2 = jf.e.S(i22, parcel);
                    }
                }
                jf.e.B(iX11, parcel);
                return new u(strW8, numS2.intValue());
            case 12:
                int iX12 = jf.e.X(parcel);
                String strW9 = null;
                String strW10 = null;
                String strW11 = null;
                while (parcel.dataPosition() < iX12) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 2) {
                        strW9 = jf.e.w(i23, parcel);
                    } else if (c11 == 3) {
                        strW10 = jf.e.w(i23, parcel);
                    } else if (c11 != 4) {
                        jf.e.W(i23, parcel);
                    } else {
                        strW11 = jf.e.w(i23, parcel);
                    }
                }
                jf.e.B(iX12, parcel);
                return new v(strW9, strW10, strW11);
            case 13:
                try {
                    return w.a(parcel.readString());
                } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e11) {
                    org.bouncycastle.jce.provider.a.m(e11);
                    return null;
                }
            case 14:
                int iX13 = jf.e.X(parcel);
                byte[] bArrR7 = null;
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                while (parcel.dataPosition() < iX13) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 2) {
                        bArrR7 = jf.e.r(i24, parcel);
                    } else if (c12 == 3) {
                        strW12 = jf.e.w(i24, parcel);
                    } else if (c12 == 4) {
                        strW13 = jf.e.w(i24, parcel);
                    } else if (c12 != 5) {
                        jf.e.W(i24, parcel);
                    } else {
                        strW14 = jf.e.w(i24, parcel);
                    }
                }
                jf.e.B(iX13, parcel);
                return new x(strW12, strW13, strW14, bArrR7);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return z.a(string);
                } catch (ResidentKeyRequirement$UnsupportedResidentKeyRequirementException e12) {
                    org.bouncycastle.jce.provider.a.m(e12);
                    return null;
                }
            case 16:
                int iX14 = jf.e.X(parcel);
                String strW15 = null;
                while (parcel.dataPosition() < iX14) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        jf.e.W(i25, parcel);
                    } else {
                        strW15 = jf.e.w(i25, parcel);
                    }
                }
                jf.e.B(iX14, parcel);
                return new m0(strW15);
            case 17:
                try {
                    return a0.a(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e13) {
                    org.bouncycastle.jce.provider.a.m(e13);
                    return null;
                }
            case 18:
                int iX15 = jf.e.X(parcel);
                String strW16 = null;
                String strW17 = null;
                while (parcel.dataPosition() < iX15) {
                    int i26 = parcel.readInt();
                    char c13 = (char) i26;
                    if (c13 == 2) {
                        strW16 = jf.e.w(i26, parcel);
                    } else if (c13 != 3) {
                        jf.e.W(i26, parcel);
                    } else {
                        strW17 = jf.e.w(i26, parcel);
                    }
                }
                jf.e.B(iX15, parcel);
                return new b0(strW16, strW17);
            case 19:
                try {
                    return c.a(parcel.readString());
                } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e14) {
                    org.bouncycastle.jce.provider.a.m(e14);
                    return null;
                }
            case 20:
                int iX16 = jf.e.X(parcel);
                boolean zM4 = false;
                while (parcel.dataPosition() < iX16) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        jf.e.W(i27, parcel);
                    } else {
                        zM4 = jf.e.M(i27, parcel);
                    }
                }
                jf.e.B(iX16, parcel);
                return new c0(zM4);
            case 21:
                try {
                    return d0.a(parcel.readString());
                } catch (zzbc e15) {
                    org.bouncycastle.jce.provider.a.m(e15);
                    return null;
                }
            case 22:
                int iX17 = jf.e.X(parcel);
                ArrayList arrayListA4 = null;
                while (parcel.dataPosition() < iX17) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        jf.e.W(i28, parcel);
                    } else {
                        arrayListA4 = jf.e.A(parcel, i28, f0.CREATOR);
                    }
                }
                jf.e.B(iX17, parcel);
                return new e0(arrayListA4);
            case 23:
                int iX18 = jf.e.X(parcel);
                int iR2 = 0;
                short s7 = 0;
                short s8 = 0;
                while (parcel.dataPosition() < iX18) {
                    int i29 = parcel.readInt();
                    char c14 = (char) i29;
                    if (c14 == 1) {
                        iR2 = jf.e.R(i29, parcel);
                    } else if (c14 == 2) {
                        jf.e.Y(parcel, i29, 4);
                        s7 = (short) parcel.readInt();
                    } else if (c14 != 3) {
                        jf.e.W(i29, parcel);
                    } else {
                        jf.e.Y(parcel, i29, 4);
                        s8 = (short) parcel.readInt();
                    }
                }
                jf.e.B(iX18, parcel);
                return new f0(iR2, s7, s8);
            case 24:
                int iX19 = jf.e.X(parcel);
                e0 e0Var = null;
                n0 n0Var = null;
                f fVar = null;
                o0 o0Var = null;
                String strW18 = null;
                while (parcel.dataPosition() < iX19) {
                    int i31 = parcel.readInt();
                    char c15 = (char) i31;
                    if (c15 == 1) {
                        e0Var = (e0) jf.e.v(parcel, i31, e0.CREATOR);
                    } else if (c15 == 2) {
                        n0Var = (n0) jf.e.v(parcel, i31, n0.CREATOR);
                    } else if (c15 == 3) {
                        fVar = (f) jf.e.v(parcel, i31, f.CREATOR);
                    } else if (c15 == 4) {
                        o0Var = (o0) jf.e.v(parcel, i31, o0.CREATOR);
                    } else if (c15 != 5) {
                        jf.e.W(i31, parcel);
                    } else {
                        strW18 = jf.e.w(i31, parcel);
                    }
                }
                jf.e.B(iX19, parcel);
                return new e(e0Var, n0Var, fVar, o0Var, strW18);
            case 25:
                int iX20 = jf.e.X(parcel);
                o oVar = null;
                r0 r0Var = null;
                c0 c0Var = null;
                t0 t0Var = null;
                h0 h0Var = null;
                i0 i0Var = null;
                s0 s0Var = null;
                j0 j0Var = null;
                p pVar = null;
                l0 l0Var = null;
                m0 m0Var = null;
                k0 k0Var = null;
                while (parcel.dataPosition() < iX20) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 2:
                            oVar = (o) jf.e.v(parcel, i32, o.CREATOR);
                            break;
                        case 3:
                            r0Var = (r0) jf.e.v(parcel, i32, r0.CREATOR);
                            break;
                        case 4:
                            c0Var = (c0) jf.e.v(parcel, i32, c0.CREATOR);
                            break;
                        case 5:
                            t0Var = (t0) jf.e.v(parcel, i32, t0.CREATOR);
                            break;
                        case 6:
                            h0Var = (h0) jf.e.v(parcel, i32, h0.CREATOR);
                            break;
                        case 7:
                            i0Var = (i0) jf.e.v(parcel, i32, i0.CREATOR);
                            break;
                        case '\b':
                            s0Var = (s0) jf.e.v(parcel, i32, s0.CREATOR);
                            break;
                        case '\t':
                            j0Var = (j0) jf.e.v(parcel, i32, j0.CREATOR);
                            break;
                        case '\n':
                            pVar = (p) jf.e.v(parcel, i32, p.CREATOR);
                            break;
                        case 11:
                            l0Var = (l0) jf.e.v(parcel, i32, l0.CREATOR);
                            break;
                        case '\f':
                            m0Var = (m0) jf.e.v(parcel, i32, m0.CREATOR);
                            break;
                        case '\r':
                            k0Var = (k0) jf.e.v(parcel, i32, k0.CREATOR);
                            break;
                        default:
                            jf.e.W(i32, parcel);
                            break;
                    }
                }
                jf.e.B(iX20, parcel);
                return new d(oVar, r0Var, c0Var, t0Var, h0Var, i0Var, s0Var, j0Var, pVar, l0Var, m0Var, k0Var);
            case 26:
                int iX21 = jf.e.X(parcel);
                boolean zM5 = false;
                while (parcel.dataPosition() < iX21) {
                    int i33 = parcel.readInt();
                    if (((char) i33) != 1) {
                        jf.e.W(i33, parcel);
                    } else {
                        zM5 = jf.e.M(i33, parcel);
                    }
                }
                jf.e.B(iX21, parcel);
                return new f(zM5);
            case 27:
                int iX22 = jf.e.X(parcel);
                byte[] bArrR8 = null;
                byte[] bArrR9 = null;
                while (parcel.dataPosition() < iX22) {
                    int i34 = parcel.readInt();
                    char c16 = (char) i34;
                    if (c16 == 1) {
                        bArrR8 = jf.e.r(i34, parcel);
                    } else if (c16 != 2) {
                        jf.e.W(i34, parcel);
                    } else {
                        bArrR9 = jf.e.r(i34, parcel);
                    }
                }
                jf.e.B(iX22, parcel);
                return new n0(bArrR8 == null ? null : k00.q0.j(bArrR8.length, bArrR8), bArrR9 != null ? k00.q0.j(bArrR9.length, bArrR9) : null);
            case 28:
                int iX23 = jf.e.X(parcel);
                boolean zM6 = false;
                byte[] bArrR10 = null;
                while (parcel.dataPosition() < iX23) {
                    int i35 = parcel.readInt();
                    char c17 = (char) i35;
                    if (c17 == 1) {
                        zM6 = jf.e.M(i35, parcel);
                    } else if (c17 != 2) {
                        jf.e.W(i35, parcel);
                    } else {
                        bArrR10 = jf.e.r(i35, parcel);
                    }
                }
                jf.e.B(iX23, parcel);
                return new o0(zM6, bArrR10 != null ? k00.q0.j(bArrR10.length, bArrR10) : null);
            default:
                int iX24 = jf.e.X(parcel);
                byte[] bArrR11 = null;
                byte[] bArrR12 = null;
                byte[] bArrR13 = null;
                byte[] bArrR14 = null;
                byte[] bArrR15 = null;
                while (parcel.dataPosition() < iX24) {
                    int i36 = parcel.readInt();
                    char c18 = (char) i36;
                    if (c18 == 2) {
                        bArrR11 = jf.e.r(i36, parcel);
                    } else if (c18 == 3) {
                        bArrR12 = jf.e.r(i36, parcel);
                    } else if (c18 == 4) {
                        bArrR13 = jf.e.r(i36, parcel);
                    } else if (c18 == 5) {
                        bArrR14 = jf.e.r(i36, parcel);
                    } else if (c18 != 6) {
                        jf.e.W(i36, parcel);
                    } else {
                        bArrR15 = jf.e.r(i36, parcel);
                    }
                }
                jf.e.B(iX24, parcel);
                return new g(bArrR11, bArrR12, bArrR13, bArrR14, bArrR15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        switch (this.f109a) {
            case 0:
                return new b[i11];
            case 1:
                return new t0[i11];
            case 2:
                return new h0[i11];
            case 3:
                return new i0[i11];
            case 4:
                return new p[i11];
            case 5:
                return new j0[i11];
            case 6:
                return new k0[i11];
            case 7:
                return new l0[i11];
            case 8:
                return new s[i11];
            case 9:
                return new q[i11];
            case 10:
                return new t[i11];
            case 11:
                return new u[i11];
            case 12:
                return new v[i11];
            case 13:
                return new w[i11];
            case 14:
                return new x[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new z[i11];
            case 16:
                return new m0[i11];
            case 17:
                return new a0[i11];
            case 18:
                return new b0[i11];
            case 19:
                return new c[i11];
            case 20:
                return new c0[i11];
            case 21:
                return new d0[i11];
            case 22:
                return new e0[i11];
            case 23:
                return new f0[i11];
            case 24:
                return new e[i11];
            case 25:
                return new d[i11];
            case 26:
                return new f[i11];
            case 27:
                return new n0[i11];
            case 28:
                return new o0[i11];
            default:
                return new g[i11];
        }
    }
}
