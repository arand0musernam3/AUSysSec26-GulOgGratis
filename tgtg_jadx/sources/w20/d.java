package w20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.m;
import androidx.constraintlayout.widget.q;
import com.app.tgtg.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.l;
import n20.j;
import n20.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class d extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f43088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f43090c;

    public d(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        j jVar = new j();
        this.f43090c = jVar;
        n20.l lVar = new n20.l(0.5f);
        n nVarH = jVar.f30345b.f30318a.h();
        nVarH.f30380e = lVar;
        nVarH.f30381f = lVar;
        nVarH.f30382g = lVar;
        nVarH.f30383h = lVar;
        jVar.setShapeAppearanceModel(nVarH.a());
        this.f43090c.t(ColorStateList.valueOf(-1));
        setBackground(this.f43090c);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.N, i11, 0);
        this.f43089b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f43088a = new l(this, 28);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            l lVar = this.f43088a;
            handler.removeCallbacks(lVar);
            handler.post(lVar);
        }
    }

    public void j() {
        q qVar = new q();
        qVar.e(this);
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!map.containsKey(i12)) {
                    map.put(i12, new ArrayList());
                }
                ((List) map.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.f43089b;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                m mVar = qVar.i(((View) it.next()).getId()).f2407e;
                mVar.A = R.id.circle_center;
                mVar.B = iRound;
                mVar.C = size;
                size += 360.0f / list.size();
            }
        }
        qVar.b(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            l lVar = this.f43088a;
            handler.removeCallbacks(lVar);
            handler.post(lVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f43090c.t(ColorStateList.valueOf(i11));
    }

    public void setRadius(int i11) {
        this.f43089b = i11;
        j();
    }

    public d(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(@NonNull Context context) {
        this(context, null);
    }
}
