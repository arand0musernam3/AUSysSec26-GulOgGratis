package androidx.constraintlayout.widget;

import a40.d0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import m0.i1;
import o00.x0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.xmlpull.v1.XmlPullParserException;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f2485h = {0, 4, 8};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f2486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f2487j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2489b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f2490c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2491d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f2492e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2493f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f2494g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2486i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2487j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(AppConstants.RESULT_CODE_ORDER_CANCELLED, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static l d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        l lVar = new l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, v.f2510d);
        p(lVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return lVar;
    }

    public static int[] g(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR);
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < strArrSplit.length) {
            String strTrim = strArrSplit[i11].trim();
            try {
                iIntValue = u.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i12] = iIntValue;
            i11++;
            i12++;
        }
        return i12 != strArrSplit.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public static l h(Context context, AttributeSet attributeSet, boolean z11) {
        l lVar = new l();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? v.f2510d : v.f2507a);
        if (z11) {
            p(lVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i11 = 0;
            while (true) {
                m mVar = lVar.f2407e;
                if (i11 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i11);
                    o oVar = lVar.f2405c;
                    p pVar = lVar.f2408f;
                    n nVar = lVar.f2406d;
                    if (index != 1 && 23 != index && 24 != index) {
                        nVar.f2454a = true;
                        mVar.f2414b = true;
                        oVar.f2466a = true;
                        pVar.f2472a = true;
                    }
                    SparseIntArray sparseIntArray = f2486i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            mVar.f2443q = m(typedArrayObtainStyledAttributes, index, mVar.f2443q);
                            break;
                        case 2:
                            mVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.J);
                            break;
                        case 3:
                            mVar.f2441p = m(typedArrayObtainStyledAttributes, index, mVar.f2441p);
                            break;
                        case 4:
                            mVar.f2439o = m(typedArrayObtainStyledAttributes, index, mVar.f2439o);
                            break;
                        case 5:
                            mVar.f2452z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            mVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mVar.D);
                            break;
                        case 7:
                            mVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mVar.E);
                            break;
                        case 8:
                            mVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.K);
                            break;
                        case 9:
                            mVar.f2449w = m(typedArrayObtainStyledAttributes, index, mVar.f2449w);
                            break;
                        case 10:
                            mVar.f2448v = m(typedArrayObtainStyledAttributes, index, mVar.f2448v);
                            break;
                        case 11:
                            mVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.Q);
                            break;
                        case 12:
                            mVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.R);
                            break;
                        case 13:
                            mVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.N);
                            break;
                        case 14:
                            mVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.P);
                            break;
                        case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                            mVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.S);
                            break;
                        case 16:
                            mVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.O);
                            break;
                        case 17:
                            mVar.f2420e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mVar.f2420e);
                            break;
                        case 18:
                            mVar.f2422f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, mVar.f2422f);
                            break;
                        case 19:
                            mVar.f2424g = typedArrayObtainStyledAttributes.getFloat(index, mVar.f2424g);
                            break;
                        case 20:
                            mVar.f2450x = typedArrayObtainStyledAttributes.getFloat(index, mVar.f2450x);
                            break;
                        case 21:
                            mVar.f2418d = typedArrayObtainStyledAttributes.getLayoutDimension(index, mVar.f2418d);
                            break;
                        case 22:
                            int i12 = typedArrayObtainStyledAttributes.getInt(index, oVar.f2467b);
                            oVar.f2467b = i12;
                            oVar.f2467b = f2485h[i12];
                            break;
                        case 23:
                            mVar.f2416c = typedArrayObtainStyledAttributes.getLayoutDimension(index, mVar.f2416c);
                            break;
                        case 24:
                            mVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.G);
                            break;
                        case 25:
                            mVar.f2428i = m(typedArrayObtainStyledAttributes, index, mVar.f2428i);
                            break;
                        case 26:
                            mVar.f2430j = m(typedArrayObtainStyledAttributes, index, mVar.f2430j);
                            break;
                        case 27:
                            mVar.F = typedArrayObtainStyledAttributes.getInt(index, mVar.F);
                            break;
                        case 28:
                            mVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.H);
                            break;
                        case 29:
                            mVar.f2432k = m(typedArrayObtainStyledAttributes, index, mVar.f2432k);
                            break;
                        case 30:
                            mVar.l = m(typedArrayObtainStyledAttributes, index, mVar.l);
                            break;
                        case BERTags.DATE /* 31 */:
                            mVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.L);
                            break;
                        case 32:
                            mVar.f2446t = m(typedArrayObtainStyledAttributes, index, mVar.f2446t);
                            break;
                        case 33:
                            mVar.f2447u = m(typedArrayObtainStyledAttributes, index, mVar.f2447u);
                            break;
                        case BERTags.DURATION /* 34 */:
                            mVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.I);
                            break;
                        case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                            mVar.f2437n = m(typedArrayObtainStyledAttributes, index, mVar.f2437n);
                            break;
                        case 36:
                            mVar.f2435m = m(typedArrayObtainStyledAttributes, index, mVar.f2435m);
                            break;
                        case 37:
                            mVar.f2451y = typedArrayObtainStyledAttributes.getFloat(index, mVar.f2451y);
                            break;
                        case 38:
                            lVar.f2403a = typedArrayObtainStyledAttributes.getResourceId(index, lVar.f2403a);
                            break;
                        case 39:
                            mVar.V = typedArrayObtainStyledAttributes.getFloat(index, mVar.V);
                            break;
                        case 40:
                            mVar.U = typedArrayObtainStyledAttributes.getFloat(index, mVar.U);
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            mVar.W = typedArrayObtainStyledAttributes.getInt(index, mVar.W);
                            break;
                        case 42:
                            mVar.X = typedArrayObtainStyledAttributes.getInt(index, mVar.X);
                            break;
                        case 43:
                            oVar.f2469d = typedArrayObtainStyledAttributes.getFloat(index, oVar.f2469d);
                            break;
                        case 44:
                            pVar.f2483m = true;
                            pVar.f2484n = typedArrayObtainStyledAttributes.getDimension(index, pVar.f2484n);
                            break;
                        case 45:
                            pVar.f2474c = typedArrayObtainStyledAttributes.getFloat(index, pVar.f2474c);
                            break;
                        case 46:
                            pVar.f2475d = typedArrayObtainStyledAttributes.getFloat(index, pVar.f2475d);
                            break;
                        case 47:
                            pVar.f2476e = typedArrayObtainStyledAttributes.getFloat(index, pVar.f2476e);
                            break;
                        case 48:
                            pVar.f2477f = typedArrayObtainStyledAttributes.getFloat(index, pVar.f2477f);
                            break;
                        case 49:
                            pVar.f2478g = typedArrayObtainStyledAttributes.getDimension(index, pVar.f2478g);
                            break;
                        case 50:
                            pVar.f2479h = typedArrayObtainStyledAttributes.getDimension(index, pVar.f2479h);
                            break;
                        case 51:
                            pVar.f2481j = typedArrayObtainStyledAttributes.getDimension(index, pVar.f2481j);
                            break;
                        case 52:
                            pVar.f2482k = typedArrayObtainStyledAttributes.getDimension(index, pVar.f2482k);
                            break;
                        case 53:
                            pVar.l = typedArrayObtainStyledAttributes.getDimension(index, pVar.l);
                            break;
                        case 54:
                            mVar.Y = typedArrayObtainStyledAttributes.getInt(index, mVar.Y);
                            break;
                        case 55:
                            mVar.Z = typedArrayObtainStyledAttributes.getInt(index, mVar.Z);
                            break;
                        case 56:
                            mVar.f2413a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.f2413a0);
                            break;
                        case 57:
                            mVar.f2415b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.f2415b0);
                            break;
                        case 58:
                            mVar.f2417c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.f2417c0);
                            break;
                        case 59:
                            mVar.f2419d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.f2419d0);
                            break;
                        case 60:
                            pVar.f2473b = typedArrayObtainStyledAttributes.getFloat(index, pVar.f2473b);
                            break;
                        case 61:
                            mVar.A = m(typedArrayObtainStyledAttributes, index, mVar.A);
                            break;
                        case 62:
                            mVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.B);
                            break;
                        case 63:
                            mVar.C = typedArrayObtainStyledAttributes.getFloat(index, mVar.C);
                            break;
                        case 64:
                            nVar.f2455b = m(typedArrayObtainStyledAttributes, index, nVar.f2455b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                nVar.f2457d = i6.e.f23414d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                nVar.f2457d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            nVar.f2459f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            nVar.f2461h = typedArrayObtainStyledAttributes.getFloat(index, nVar.f2461h);
                            break;
                        case 68:
                            oVar.f2470e = typedArrayObtainStyledAttributes.getFloat(index, oVar.f2470e);
                            break;
                        case 69:
                            mVar.f2421e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            mVar.f2423f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            mVar.f2425g0 = typedArrayObtainStyledAttributes.getInt(index, mVar.f2425g0);
                            break;
                        case 73:
                            mVar.f2427h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.f2427h0);
                            break;
                        case 74:
                            mVar.f2433k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            mVar.f2440o0 = typedArrayObtainStyledAttributes.getBoolean(index, mVar.f2440o0);
                            break;
                        case 76:
                            nVar.f2458e = typedArrayObtainStyledAttributes.getInt(index, nVar.f2458e);
                            break;
                        case 77:
                            mVar.f2434l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            oVar.f2468c = typedArrayObtainStyledAttributes.getInt(index, oVar.f2468c);
                            break;
                        case 79:
                            nVar.f2460g = typedArrayObtainStyledAttributes.getFloat(index, nVar.f2460g);
                            break;
                        case 80:
                            mVar.f2436m0 = typedArrayObtainStyledAttributes.getBoolean(index, mVar.f2436m0);
                            break;
                        case 81:
                            mVar.f2438n0 = typedArrayObtainStyledAttributes.getBoolean(index, mVar.f2438n0);
                            break;
                        case 82:
                            nVar.f2456c = typedArrayObtainStyledAttributes.getInteger(index, nVar.f2456c);
                            break;
                        case 83:
                            pVar.f2480i = m(typedArrayObtainStyledAttributes, index, pVar.f2480i);
                            break;
                        case 84:
                            nVar.f2463j = typedArrayObtainStyledAttributes.getInteger(index, nVar.f2463j);
                            break;
                        case 85:
                            nVar.f2462i = typedArrayObtainStyledAttributes.getFloat(index, nVar.f2462i);
                            break;
                        case 86:
                            int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i13 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                nVar.f2465m = resourceId;
                                if (resourceId != -1) {
                                    nVar.l = -2;
                                }
                            } else if (i13 != 3) {
                                nVar.l = typedArrayObtainStyledAttributes.getInteger(index, nVar.f2465m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                nVar.f2464k = string;
                                if (string.indexOf(ExpiryDateInput.SEPARATOR) <= 0) {
                                    nVar.l = -1;
                                } else {
                                    nVar.f2465m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    nVar.l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            mVar.f2444r = m(typedArrayObtainStyledAttributes, index, mVar.f2444r);
                            break;
                        case 92:
                            mVar.f2445s = m(typedArrayObtainStyledAttributes, index, mVar.f2445s);
                            break;
                        case 93:
                            mVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.M);
                            break;
                        case 94:
                            mVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mVar.T);
                            break;
                        case 95:
                            n(mVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            n(mVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            mVar.f2442p0 = typedArrayObtainStyledAttributes.getInt(index, mVar.f2442p0);
                            break;
                    }
                    i11++;
                } else if (mVar.f2433k0 != null) {
                    mVar.f2431j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return lVar;
    }

    public static int m(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.q.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void o(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i11 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f11 = Float.parseFloat(strSubstring3);
                        float f12 = Float.parseFloat(strSubstring4);
                        if (f11 > 0.0f && f12 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(f12 / f11);
                            } else {
                                Math.abs(f11 / f12);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public static void p(l lVar, TypedArray typedArray) {
        char c3;
        int indexCount = typedArray.getIndexCount();
        k kVar = new k();
        kVar.f2392a = new int[10];
        kVar.f2393b = new int[10];
        kVar.f2394c = 0;
        kVar.f2395d = new int[10];
        kVar.f2396e = new float[10];
        kVar.f2397f = 0;
        kVar.f2398g = new int[5];
        kVar.f2399h = new String[5];
        kVar.f2400i = 0;
        kVar.f2401j = new int[4];
        kVar.f2402k = new boolean[4];
        kVar.l = 0;
        lVar.f2410h = kVar;
        n nVar = lVar.f2406d;
        nVar.f2454a = false;
        m mVar = lVar.f2407e;
        mVar.f2414b = false;
        o oVar = lVar.f2405c;
        oVar.f2466a = false;
        p pVar = lVar.f2408f;
        pVar.f2472a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            int i12 = f2487j.get(index);
            SparseIntArray sparseIntArray = f2486i;
            switch (i12) {
                case 2:
                    c3 = 5;
                    kVar.b(2, typedArray.getDimensionPixelSize(index, mVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c3 = 5;
                    break;
                case 5:
                    c3 = 5;
                    kVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    kVar.b(6, typedArray.getDimensionPixelOffset(index, mVar.D));
                    c3 = 5;
                    break;
                case 7:
                    kVar.b(7, typedArray.getDimensionPixelOffset(index, mVar.E));
                    c3 = 5;
                    break;
                case 8:
                    kVar.b(8, typedArray.getDimensionPixelSize(index, mVar.K));
                    c3 = 5;
                    break;
                case 11:
                    kVar.b(11, typedArray.getDimensionPixelSize(index, mVar.Q));
                    c3 = 5;
                    break;
                case 12:
                    kVar.b(12, typedArray.getDimensionPixelSize(index, mVar.R));
                    c3 = 5;
                    break;
                case 13:
                    kVar.b(13, typedArray.getDimensionPixelSize(index, mVar.N));
                    c3 = 5;
                    break;
                case 14:
                    kVar.b(14, typedArray.getDimensionPixelSize(index, mVar.P));
                    c3 = 5;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    kVar.b(15, typedArray.getDimensionPixelSize(index, mVar.S));
                    c3 = 5;
                    break;
                case 16:
                    kVar.b(16, typedArray.getDimensionPixelSize(index, mVar.O));
                    c3 = 5;
                    break;
                case 17:
                    kVar.b(17, typedArray.getDimensionPixelOffset(index, mVar.f2420e));
                    c3 = 5;
                    break;
                case 18:
                    kVar.b(18, typedArray.getDimensionPixelOffset(index, mVar.f2422f));
                    c3 = 5;
                    break;
                case 19:
                    kVar.a(typedArray.getFloat(index, mVar.f2424g), 19);
                    c3 = 5;
                    break;
                case 20:
                    kVar.a(typedArray.getFloat(index, mVar.f2450x), 20);
                    c3 = 5;
                    break;
                case 21:
                    kVar.b(21, typedArray.getLayoutDimension(index, mVar.f2418d));
                    c3 = 5;
                    break;
                case 22:
                    kVar.b(22, f2485h[typedArray.getInt(index, oVar.f2467b)]);
                    c3 = 5;
                    break;
                case 23:
                    kVar.b(23, typedArray.getLayoutDimension(index, mVar.f2416c));
                    c3 = 5;
                    break;
                case 24:
                    kVar.b(24, typedArray.getDimensionPixelSize(index, mVar.G));
                    c3 = 5;
                    break;
                case 27:
                    kVar.b(27, typedArray.getInt(index, mVar.F));
                    c3 = 5;
                    break;
                case 28:
                    kVar.b(28, typedArray.getDimensionPixelSize(index, mVar.H));
                    c3 = 5;
                    break;
                case BERTags.DATE /* 31 */:
                    kVar.b(31, typedArray.getDimensionPixelSize(index, mVar.L));
                    c3 = 5;
                    break;
                case BERTags.DURATION /* 34 */:
                    kVar.b(34, typedArray.getDimensionPixelSize(index, mVar.I));
                    c3 = 5;
                    break;
                case 37:
                    kVar.a(typedArray.getFloat(index, mVar.f2451y), 37);
                    c3 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, lVar.f2403a);
                    lVar.f2403a = resourceId;
                    kVar.b(38, resourceId);
                    c3 = 5;
                    break;
                case 39:
                    kVar.a(typedArray.getFloat(index, mVar.V), 39);
                    c3 = 5;
                    break;
                case 40:
                    kVar.a(typedArray.getFloat(index, mVar.U), 40);
                    c3 = 5;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    kVar.b(41, typedArray.getInt(index, mVar.W));
                    c3 = 5;
                    break;
                case 42:
                    kVar.b(42, typedArray.getInt(index, mVar.X));
                    c3 = 5;
                    break;
                case 43:
                    kVar.a(typedArray.getFloat(index, oVar.f2469d), 43);
                    c3 = 5;
                    break;
                case 44:
                    kVar.d(44, true);
                    kVar.a(typedArray.getDimension(index, pVar.f2484n), 44);
                    c3 = 5;
                    break;
                case 45:
                    kVar.a(typedArray.getFloat(index, pVar.f2474c), 45);
                    c3 = 5;
                    break;
                case 46:
                    kVar.a(typedArray.getFloat(index, pVar.f2475d), 46);
                    c3 = 5;
                    break;
                case 47:
                    kVar.a(typedArray.getFloat(index, pVar.f2476e), 47);
                    c3 = 5;
                    break;
                case 48:
                    kVar.a(typedArray.getFloat(index, pVar.f2477f), 48);
                    c3 = 5;
                    break;
                case 49:
                    kVar.a(typedArray.getDimension(index, pVar.f2478g), 49);
                    c3 = 5;
                    break;
                case 50:
                    kVar.a(typedArray.getDimension(index, pVar.f2479h), 50);
                    c3 = 5;
                    break;
                case 51:
                    kVar.a(typedArray.getDimension(index, pVar.f2481j), 51);
                    c3 = 5;
                    break;
                case 52:
                    kVar.a(typedArray.getDimension(index, pVar.f2482k), 52);
                    c3 = 5;
                    break;
                case 53:
                    kVar.a(typedArray.getDimension(index, pVar.l), 53);
                    c3 = 5;
                    break;
                case 54:
                    kVar.b(54, typedArray.getInt(index, mVar.Y));
                    c3 = 5;
                    break;
                case 55:
                    kVar.b(55, typedArray.getInt(index, mVar.Z));
                    c3 = 5;
                    break;
                case 56:
                    kVar.b(56, typedArray.getDimensionPixelSize(index, mVar.f2413a0));
                    c3 = 5;
                    break;
                case 57:
                    kVar.b(57, typedArray.getDimensionPixelSize(index, mVar.f2415b0));
                    c3 = 5;
                    break;
                case 58:
                    kVar.b(58, typedArray.getDimensionPixelSize(index, mVar.f2417c0));
                    c3 = 5;
                    break;
                case 59:
                    kVar.b(59, typedArray.getDimensionPixelSize(index, mVar.f2419d0));
                    c3 = 5;
                    break;
                case 60:
                    kVar.a(typedArray.getFloat(index, pVar.f2473b), 60);
                    c3 = 5;
                    break;
                case 62:
                    kVar.b(62, typedArray.getDimensionPixelSize(index, mVar.B));
                    c3 = 5;
                    break;
                case 63:
                    kVar.a(typedArray.getFloat(index, mVar.C), 63);
                    c3 = 5;
                    break;
                case 64:
                    kVar.b(64, m(typedArray, index, nVar.f2455b));
                    c3 = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        kVar.c(65, typedArray.getString(index));
                    } else {
                        kVar.c(65, i6.e.f23414d[typedArray.getInteger(index, 0)]);
                    }
                    c3 = 5;
                    break;
                case 66:
                    kVar.b(66, typedArray.getInt(index, 0));
                    c3 = 5;
                    break;
                case 67:
                    kVar.a(typedArray.getFloat(index, nVar.f2461h), 67);
                    c3 = 5;
                    break;
                case 68:
                    kVar.a(typedArray.getFloat(index, oVar.f2470e), 68);
                    c3 = 5;
                    break;
                case 69:
                    kVar.a(typedArray.getFloat(index, 1.0f), 69);
                    c3 = 5;
                    break;
                case 70:
                    kVar.a(typedArray.getFloat(index, 1.0f), 70);
                    c3 = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c3 = 5;
                    break;
                case 72:
                    kVar.b(72, typedArray.getInt(index, mVar.f2425g0));
                    c3 = 5;
                    break;
                case 73:
                    kVar.b(73, typedArray.getDimensionPixelSize(index, mVar.f2427h0));
                    c3 = 5;
                    break;
                case 74:
                    kVar.c(74, typedArray.getString(index));
                    c3 = 5;
                    break;
                case 75:
                    kVar.d(75, typedArray.getBoolean(index, mVar.f2440o0));
                    c3 = 5;
                    break;
                case 76:
                    kVar.b(76, typedArray.getInt(index, nVar.f2458e));
                    c3 = 5;
                    break;
                case 77:
                    kVar.c(77, typedArray.getString(index));
                    c3 = 5;
                    break;
                case 78:
                    kVar.b(78, typedArray.getInt(index, oVar.f2468c));
                    c3 = 5;
                    break;
                case 79:
                    kVar.a(typedArray.getFloat(index, nVar.f2460g), 79);
                    c3 = 5;
                    break;
                case 80:
                    kVar.d(80, typedArray.getBoolean(index, mVar.f2436m0));
                    c3 = 5;
                    break;
                case 81:
                    kVar.d(81, typedArray.getBoolean(index, mVar.f2438n0));
                    c3 = 5;
                    break;
                case 82:
                    kVar.b(82, typedArray.getInteger(index, nVar.f2456c));
                    c3 = 5;
                    break;
                case 83:
                    kVar.b(83, m(typedArray, index, pVar.f2480i));
                    c3 = 5;
                    break;
                case 84:
                    kVar.b(84, typedArray.getInteger(index, nVar.f2463j));
                    c3 = 5;
                    break;
                case 85:
                    kVar.a(typedArray.getFloat(index, nVar.f2462i), 85);
                    c3 = 5;
                    break;
                case 86:
                    int i13 = typedArray.peekValue(index).type;
                    if (i13 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        nVar.f2465m = resourceId2;
                        kVar.b(89, resourceId2);
                        if (nVar.f2465m != -1) {
                            nVar.l = -2;
                            kVar.b(88, -2);
                        }
                    } else if (i13 == 3) {
                        String string = typedArray.getString(index);
                        nVar.f2464k = string;
                        kVar.c(90, string);
                        if (nVar.f2464k.indexOf(ExpiryDateInput.SEPARATOR) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            nVar.f2465m = resourceId3;
                            kVar.b(89, resourceId3);
                            nVar.l = -2;
                            kVar.b(88, -2);
                        } else {
                            nVar.l = -1;
                            kVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, nVar.f2465m);
                        nVar.l = integer;
                        kVar.b(88, integer);
                    }
                    c3 = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c3 = 5;
                    break;
                case 93:
                    kVar.b(93, typedArray.getDimensionPixelSize(index, mVar.M));
                    c3 = 5;
                    break;
                case 94:
                    kVar.b(94, typedArray.getDimensionPixelSize(index, mVar.T));
                    c3 = 5;
                    break;
                case 95:
                    n(kVar, typedArray, index, 0);
                    c3 = 5;
                    break;
                case 96:
                    n(kVar, typedArray, index, 1);
                    c3 = 5;
                    break;
                case 97:
                    kVar.b(97, typedArray.getInt(index, mVar.f2442p0));
                    c3 = 5;
                    break;
                case 98:
                    if (MotionLayout.f2261u1) {
                        int resourceId4 = typedArray.getResourceId(index, lVar.f2403a);
                        lVar.f2403a = resourceId4;
                        if (resourceId4 == -1) {
                            lVar.f2404b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        lVar.f2404b = typedArray.getString(index);
                    } else {
                        lVar.f2403a = typedArray.getResourceId(index, lVar.f2403a);
                    }
                    c3 = 5;
                    break;
                case 99:
                    kVar.d(99, typedArray.getBoolean(index, mVar.f2426h));
                    c3 = 5;
                    break;
            }
        }
    }

    public static String q(int i11) {
        switch (i11) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(MotionLayout motionLayout) {
        l lVar;
        int childCount = motionLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            int id2 = childAt.getId();
            Integer numValueOf = Integer.valueOf(id2);
            HashMap map = this.f2494g;
            if (!map.containsKey(numValueOf)) {
                Log.w("ConstraintSet", "id unknown " + x0.w(childAt));
            } else if (this.f2493f && id2 == -1) {
                d0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id2)) && (lVar = (l) map.get(Integer.valueOf(id2))) != null) {
                b.e(childAt, lVar.f2409g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f2494g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + x0.w(childAt));
            } else {
                if (this.f2493f && id2 == -1) {
                    d0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id2 != -1) {
                    if (map.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        l lVar = (l) map.get(Integer.valueOf(id2));
                        if (lVar != null) {
                            o oVar = lVar.f2405c;
                            m mVar = lVar.f2407e;
                            p pVar = lVar.f2408f;
                            if (childAt instanceof Barrier) {
                                mVar.f2429i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(mVar.f2425g0);
                                barrier.setMargin(mVar.f2427h0);
                                barrier.setAllowsGoneWidget(mVar.f2440o0);
                                int[] iArr = mVar.f2431j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = mVar.f2433k0;
                                    if (str != null) {
                                        int[] iArrG = g(barrier, str);
                                        mVar.f2431j0 = iArrG;
                                        barrier.setReferencedIds(iArrG);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar.a();
                            lVar.a(aVar);
                            b.e(childAt, lVar.f2409g);
                            childAt.setLayoutParams(aVar);
                            if (oVar.f2468c == 0) {
                                childAt.setVisibility(oVar.f2467b);
                            }
                            childAt.setAlpha(oVar.f2469d);
                            childAt.setRotation(pVar.f2473b);
                            childAt.setRotationX(pVar.f2474c);
                            childAt.setRotationY(pVar.f2475d);
                            childAt.setScaleX(pVar.f2476e);
                            childAt.setScaleY(pVar.f2477f);
                            if (pVar.f2480i != -1) {
                                if (((View) childAt.getParent()).findViewById(pVar.f2480i) != null) {
                                    float bottom = (r5.getBottom() + r5.getTop()) / 2.0f;
                                    float right = (r5.getRight() + r5.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(pVar.f2478g)) {
                                    childAt.setPivotX(pVar.f2478g);
                                }
                                if (!Float.isNaN(pVar.f2479h)) {
                                    childAt.setPivotY(pVar.f2479h);
                                }
                            }
                            childAt.setTranslationX(pVar.f2481j);
                            childAt.setTranslationY(pVar.f2482k);
                            childAt.setTranslationZ(pVar.l);
                            if (pVar.f2483m) {
                                childAt.setElevation(pVar.f2484n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            l lVar2 = (l) map.get(num);
            if (lVar2 != null) {
                m mVar2 = lVar2.f2407e;
                if (mVar2.f2429i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = mVar2.f2431j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = mVar2.f2433k0;
                        if (str2 != null) {
                            int[] iArrG2 = g(barrier2, str2);
                            mVar2.f2431j0 = iArrG2;
                            barrier2.setReferencedIds(iArrG2);
                        }
                    }
                    barrier2.setType(mVar2.f2425g0);
                    barrier2.setMargin(mVar2.f2427h0);
                    ConstraintLayout.a aVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.l();
                    lVar2.a(aVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, aVarGenerateDefaultLayoutParams);
                }
                if (mVar2.f2412a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a aVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    lVar2.a(aVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, aVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof c) {
                ((c) childAt2).f(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i11;
        HashMap map;
        int i12;
        q qVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = qVar.f2494g;
        map2.clear();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = constraintLayout.getChildAt(i13);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (qVar.f2493f && id2 == -1) {
                d0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id2))) {
                map2.put(Integer.valueOf(id2), new l());
            }
            l lVar = (l) map2.get(Integer.valueOf(id2));
            if (lVar == null) {
                i11 = childCount;
                map = map2;
                i12 = i13;
            } else {
                o oVar = lVar.f2405c;
                m mVar = lVar.f2407e;
                p pVar = lVar.f2408f;
                i11 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i12 = i13;
                HashMap map4 = qVar.f2492e;
                for (String str : map4.keySet()) {
                    b bVar = (b) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        StringBuilder sbS = e0.f.s(" Custom Attribute \"", str, "\" not found on ");
                        sbS.append(cls.getName());
                        Log.e("TransitionLayout", sbS.toString(), e5);
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e11);
                    } catch (InvocationTargetException e12) {
                        StringBuilder sbS2 = e0.f.s(" Custom Attribute \"", str, "\" not found on ");
                        sbS2.append(cls.getName());
                        Log.e("TransitionLayout", sbS2.toString(), e12);
                    }
                    map4 = map5;
                }
                lVar.f2409g = map3;
                lVar.c(id2, aVar);
                oVar.f2467b = childAt.getVisibility();
                oVar.f2469d = childAt.getAlpha();
                pVar.f2473b = childAt.getRotation();
                pVar.f2474c = childAt.getRotationX();
                pVar.f2475d = childAt.getRotationY();
                pVar.f2476e = childAt.getScaleX();
                pVar.f2477f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    pVar.f2478g = pivotX;
                    pVar.f2479h = pivotY;
                }
                pVar.f2481j = childAt.getTranslationX();
                pVar.f2482k = childAt.getTranslationY();
                pVar.l = childAt.getTranslationZ();
                if (pVar.f2483m) {
                    pVar.f2484n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    mVar.f2440o0 = barrier.getAllowsGoneWidget();
                    mVar.f2431j0 = barrier.getReferencedIds();
                    mVar.f2425g0 = barrier.getType();
                    mVar.f2427h0 = barrier.getMargin();
                }
            }
            i13 = i12 + 1;
            qVar = this;
            childCount = i11;
            map2 = map;
        }
    }

    public final void f(int i11, int i12, int i13, int i14) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f2494g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i11), new l());
        }
        l lVar = (l) map.get(Integer.valueOf(i11));
        if (lVar == null) {
        }
        m mVar = lVar.f2407e;
        switch (i12) {
            case 1:
                if (i14 == 1) {
                    mVar.f2428i = i13;
                    mVar.f2430j = -1;
                } else if (i14 != 2) {
                    i1.j("left to ", q(i14), " undefined");
                } else {
                    mVar.f2430j = i13;
                    mVar.f2428i = -1;
                }
                break;
            case 2:
                if (i14 == 1) {
                    mVar.f2432k = i13;
                    mVar.l = -1;
                } else if (i14 != 2) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.l = i13;
                    mVar.f2432k = -1;
                }
                break;
            case 3:
                if (i14 == 3) {
                    mVar.f2435m = i13;
                    mVar.f2437n = -1;
                    mVar.f2443q = -1;
                    mVar.f2444r = -1;
                    mVar.f2445s = -1;
                } else if (i14 != 4) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.f2437n = i13;
                    mVar.f2435m = -1;
                    mVar.f2443q = -1;
                    mVar.f2444r = -1;
                    mVar.f2445s = -1;
                }
                break;
            case 4:
                if (i14 == 4) {
                    mVar.f2441p = i13;
                    mVar.f2439o = -1;
                    mVar.f2443q = -1;
                    mVar.f2444r = -1;
                    mVar.f2445s = -1;
                } else if (i14 != 3) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.f2439o = i13;
                    mVar.f2441p = -1;
                    mVar.f2443q = -1;
                    mVar.f2444r = -1;
                    mVar.f2445s = -1;
                }
                break;
            case 5:
                if (i14 == 5) {
                    mVar.f2443q = i13;
                    mVar.f2441p = -1;
                    mVar.f2439o = -1;
                    mVar.f2435m = -1;
                    mVar.f2437n = -1;
                } else if (i14 == 3) {
                    mVar.f2444r = i13;
                    mVar.f2441p = -1;
                    mVar.f2439o = -1;
                    mVar.f2435m = -1;
                    mVar.f2437n = -1;
                } else if (i14 != 4) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.f2445s = i13;
                    mVar.f2441p = -1;
                    mVar.f2439o = -1;
                    mVar.f2435m = -1;
                    mVar.f2437n = -1;
                }
                break;
            case 6:
                if (i14 == 6) {
                    mVar.f2447u = i13;
                    mVar.f2446t = -1;
                } else if (i14 != 7) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.f2446t = i13;
                    mVar.f2447u = -1;
                }
                break;
            case 7:
                if (i14 == 7) {
                    mVar.f2449w = i13;
                    mVar.f2448v = -1;
                } else if (i14 != 6) {
                    i1.j("right to ", q(i14), " undefined");
                } else {
                    mVar.f2448v = i13;
                    mVar.f2449w = -1;
                }
                break;
            default:
                d0.h(q(i12), " to ", q(i14), " unknown");
                break;
        }
    }

    public final l i(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f2494g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i11), new l());
        }
        return (l) map.get(Integer.valueOf(i11));
    }

    public final l j(int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        HashMap map = this.f2494g;
        if (map.containsKey(numValueOf)) {
            return (l) map.get(Integer.valueOf(i11));
        }
        return null;
    }

    public final void k(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    l lVarH = h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        lVarH.f2407e.f2412a = true;
                    }
                    this.f2494g.put(Integer.valueOf(lVarH.f2403a), lVarH);
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintSet", "Error parsing resource: " + i11, e5);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i11, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.q.l(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
