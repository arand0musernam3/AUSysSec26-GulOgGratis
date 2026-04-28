package tx;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f40571a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f40572b = new HashMap();

    public static final void a(q qVar, t tVar) {
        tVar.getClass();
        y.d(new v(qVar, tVar));
    }

    public static final boolean b(t tVar) {
        boolean z11;
        tVar.getClass();
        boolean z12 = false;
        if (t.Unknown != tVar) {
            if (t.Core != tVar) {
                String string = ax.a0.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + tVar, null);
                if (string == null || !Intrinsics.areEqual(string, "18.2.3")) {
                    t tVarC = tVar.c();
                    if (tVarC == tVar) {
                        switch (u.$EnumSwitchMapping$0[tVar.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case BERTags.DATE /* 31 */:
                            case 32:
                            case 33:
                            case BERTags.DURATION /* 34 */:
                            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                            case 36:
                            case 37:
                                break;
                            default:
                                z12 = true;
                                break;
                        }
                        return y.b("FBSDKFeature" + tVar, ax.a0.b(), z12);
                    }
                    if (b(tVarC)) {
                        switch (u.$EnumSwitchMapping$0[tVar.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case BERTags.DATE /* 31 */:
                            case 32:
                            case 33:
                            case BERTags.DURATION /* 34 */:
                            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                            case 36:
                            case 37:
                                z11 = false;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        if (y.b("FBSDKFeature" + tVar, ax.a0.b(), z11)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
