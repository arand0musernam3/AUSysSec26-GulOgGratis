package w5;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i4.i;
import k4.e;
import k4.g;
import k4.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f43219a;

    public a(e eVar) {
        this.f43219a = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.f25943a;
            e eVar = this.f43219a;
            if (Intrinsics.areEqual(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                e40.a.f();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.f25944a);
            textPaint.setStrokeMiter(hVar.f25945b);
            int i11 = hVar.f25947d;
            textPaint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i12 = hVar.f25946c;
            textPaint.setStrokeCap(i12 == 0 ? Paint.Cap.BUTT : i12 == 1 ? Paint.Cap.ROUND : i12 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            i iVar = hVar.f25948e;
            textPaint.setPathEffect(iVar != null ? iVar.f23263a : null);
        }
    }
}
