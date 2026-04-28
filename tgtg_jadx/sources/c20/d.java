package c20;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import com.app.tgtg.model.local.AppConstants;
import i20.r;
import i20.t;
import i20.v;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.iana.AEADAlgorithm;
import qa.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, String str, Class cls) {
        super(cls, str);
        this.f6962a = i11;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f6962a) {
            case 0:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 1:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 2:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 3:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 4:
                return Float.valueOf(((i20.h) obj).f22988h);
            case 5:
                return Float.valueOf(((i20.h) obj).f22989i);
            case 6:
                return Float.valueOf(((i20.j) obj).f23002h);
            case 7:
                return Float.valueOf(((i20.j) obj).f23003i);
            case 8:
                return Float.valueOf(((i20.n) obj).b());
            case 9:
                return Float.valueOf(((t) obj).f23070h);
            case 10:
                return Float.valueOf(((v) obj).f23081i);
            case 11:
                return Float.valueOf(((SwitchCompat) obj).f2097z);
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return null;
            case 16:
                return null;
            case 17:
                return Float.valueOf(k0.f36692a.d((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f6962a) {
            case 0:
                View view = (View) obj;
                view.getLayoutParams().width = ((Float) obj2).intValue();
                view.requestLayout();
                break;
            case 1:
                View view2 = (View) obj;
                view2.getLayoutParams().height = ((Float) obj2).intValue();
                view2.requestLayout();
                break;
            case 2:
                View view3 = (View) obj;
                view3.setPaddingRelative(((Float) obj2).intValue(), view3.getPaddingTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                break;
            case 3:
                View view4 = (View) obj;
                view4.setPaddingRelative(view4.getPaddingStart(), view4.getPaddingTop(), ((Float) obj2).intValue(), view4.getPaddingBottom());
                break;
            case 4:
                i20.h hVar = (i20.h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hVar.f22988h = fFloatValue;
                int i11 = (int) (fFloatValue * 5400.0f);
                u8.a aVar = hVar.f22985e;
                ArrayList arrayList = (ArrayList) hVar.f7114b;
                i20.o oVar = (i20.o) arrayList.get(0);
                float f11 = hVar.f22988h * 1520.0f;
                oVar.f23036a = (-20.0f) + f11;
                oVar.f23037b = f11;
                for (int i12 = 0; i12 < 4; i12++) {
                    oVar.f23037b = (aVar.getInterpolation(c5.b.i(i11, i20.h.f22979k[i12], 667)) * 250.0f) + oVar.f23037b;
                    oVar.f23036a = (aVar.getInterpolation(c5.b.i(i11, i20.h.l[i12], 667)) * 250.0f) + oVar.f23036a;
                }
                float f12 = oVar.f23036a;
                float f13 = oVar.f23037b;
                oVar.f23036a = (((f13 - f12) * hVar.f22989i) + f12) / 360.0f;
                oVar.f23037b = f13 / 360.0f;
                int i13 = 0;
                while (true) {
                    if (i13 < 4) {
                        float fI = c5.b.i(i11, i20.h.f22980m[i13], AppConstants.REQUEST_CODE_ORDER_VIEW);
                        if (fI <= 0.0f || fI >= 1.0f) {
                            i13++;
                        } else {
                            int i14 = i13 + hVar.f22987g;
                            int[] iArr = hVar.f22986f.f22957e;
                            int length = i14 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((i20.o) arrayList.get(0)).f23038c = k10.b.a(aVar.getInterpolation(fI), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((r) hVar.f7113a).invalidateSelf();
                break;
            case 5:
                ((i20.h) obj).f22989i = ((Float) obj2).floatValue();
                break;
            case 6:
                i20.j jVar = (i20.j) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                jVar.f23002h = fFloatValue2;
                int i15 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jVar.f22999e;
                ArrayList arrayList2 = (ArrayList) jVar.f7114b;
                i20.o oVar2 = (i20.o) arrayList2.get(0);
                float f14 = jVar.f23002h * 1080.0f;
                int[] iArr2 = i20.j.l;
                float interpolation = 0.0f;
                for (int i16 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(c5.b.i(i15, i16, 500)) * 90.0f;
                }
                oVar2.f23042g = f14 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(c5.b.i(i15, 0, 3000)) - timeInterpolator.getInterpolation(c5.b.i(i15, 3000, 3000));
                oVar2.f23036a = 0.0f;
                float[] fArr = i20.j.f22994m;
                float fJ = u00.d.J(fArr[0], fArr[1], interpolation2);
                oVar2.f23037b = fJ;
                float f15 = jVar.f23003i;
                if (f15 > 0.0f) {
                    oVar2.f23037b = (1.0f - f15) * fJ;
                }
                int i17 = 0;
                while (true) {
                    if (i17 < iArr2.length) {
                        float fI2 = c5.b.i(i15, iArr2[i17], 100);
                        if (fI2 < 0.0f || fI2 > 1.0f) {
                            i17++;
                        } else {
                            int i18 = i17 + jVar.f23001g;
                            int[] iArr3 = jVar.f23000f.f22957e;
                            int length3 = i18 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((i20.o) arrayList2.get(0)).f23038c = k10.b.a(timeInterpolator.getInterpolation(fI2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((r) jVar.f7113a).invalidateSelf();
                break;
            case 7:
                ((i20.j) obj).f23003i = ((Float) obj2).floatValue();
                break;
            case 8:
                i20.n nVar = (i20.n) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (nVar.f23033i != fFloatValue3) {
                    nVar.f23033i = fFloatValue3;
                    nVar.invalidateSelf();
                }
                break;
            case 9:
                t tVar = (t) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                tVar.f23070h = fFloatValue4;
                ArrayList arrayList3 = (ArrayList) tVar.f7114b;
                ((i20.o) arrayList3.get(0)).f23036a = 0.0f;
                float fI3 = c5.b.i((int) (fFloatValue4 * 333.0f), 0, 667);
                i20.o oVar3 = (i20.o) arrayList3.get(0);
                i20.o oVar4 = (i20.o) arrayList3.get(1);
                u8.a aVar2 = tVar.f23066d;
                float interpolation3 = aVar2.getInterpolation(fI3);
                oVar4.f23036a = interpolation3;
                oVar3.f23037b = interpolation3;
                i20.o oVar5 = (i20.o) arrayList3.get(1);
                i20.o oVar6 = (i20.o) arrayList3.get(2);
                float interpolation4 = aVar2.getInterpolation(fI3 + 0.49925038f);
                oVar6.f23036a = interpolation4;
                oVar5.f23037b = interpolation4;
                ((i20.o) arrayList3.get(2)).f23037b = 1.0f;
                if (tVar.f23069g && ((i20.o) arrayList3.get(1)).f23037b < 1.0f) {
                    ((i20.o) arrayList3.get(2)).f23038c = ((i20.o) arrayList3.get(1)).f23038c;
                    ((i20.o) arrayList3.get(1)).f23038c = ((i20.o) arrayList3.get(0)).f23038c;
                    ((i20.o) arrayList3.get(0)).f23038c = tVar.f23067e.f22957e[tVar.f23068f];
                    tVar.f23069g = false;
                }
                ((r) tVar.f7113a).invalidateSelf();
                break;
            case 10:
                v vVar = (v) obj;
                float fFloatValue5 = ((Float) obj2).floatValue();
                vVar.f23081i = fFloatValue5;
                int i19 = (int) (fFloatValue5 * 1800.0f);
                Interpolator[] interpolatorArr = vVar.f23077e;
                ArrayList arrayList4 = (ArrayList) vVar.f7114b;
                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                    i20.o oVar7 = (i20.o) arrayList4.get(i21);
                    int[] iArr4 = v.l;
                    int i22 = i21 * 2;
                    int i23 = iArr4[i22];
                    int[] iArr5 = v.f23073k;
                    oVar7.f23036a = xz.b.n(interpolatorArr[i22].getInterpolation(c5.b.i(i19, i23, iArr5[i22])), 0.0f, 1.0f);
                    int i24 = i22 + 1;
                    oVar7.f23037b = xz.b.n(interpolatorArr[i24].getInterpolation(c5.b.i(i19, iArr4[i24], iArr5[i24])), 0.0f, 1.0f);
                }
                if (vVar.f23080h) {
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((i20.o) it.next()).f23038c = vVar.f23078f.f22957e[vVar.f23079g];
                    }
                    vVar.f23080h = false;
                }
                ((r) vVar.f7113a).invalidateSelf();
                break;
            case 11:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 12:
                qa.e eVar = (qa.e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f36663a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f36664b = iRound;
                int i25 = eVar.f36668f + 1;
                eVar.f36668f = i25;
                if (i25 == eVar.f36669g) {
                    k0.a(eVar.f36667e, eVar.f36663a, iRound, eVar.f36665c, eVar.f36666d);
                    eVar.f36668f = 0;
                    eVar.f36669g = 0;
                }
                break;
            case 13:
                qa.e eVar2 = (qa.e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f36665c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f36666d = iRound2;
                int i26 = eVar2.f36669g + 1;
                eVar2.f36669g = i26;
                if (eVar2.f36668f == i26) {
                    k0.a(eVar2.f36667e, eVar2.f36663a, eVar2.f36664b, eVar2.f36665c, iRound2);
                    eVar2.f36668f = 0;
                    eVar2.f36669g = 0;
                }
                break;
            case 14:
                View view5 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                k0.a(view5, view5.getLeft(), view5.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                View view6 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                k0.a(view6, Math.round(pointF4.x), Math.round(pointF4.y), view6.getRight(), view6.getBottom());
                break;
            case 16:
                View view7 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                k0.a(view7, iRound3, iRound4, view7.getWidth() + iRound3, view7.getHeight() + iRound4);
                break;
            case 17:
                k0.f36692a.f((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
