package k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25509c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f25507a = i11;
        this.f25509c = obj;
        this.f25508b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        switch (this.f25507a) {
            case 0:
                c cVar = (c) this.f25509c;
                DialogInterface.OnClickListener onClickListener = cVar.l;
                e eVar = (e) this.f25508b;
                onClickListener.onClick(eVar.f25534b, i11);
                if (cVar.f25530n) {
                    return;
                }
                eVar.f25534b.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) this.f25508b;
                x10.m mVarA = materialCalendarGridView.a();
                if (i11 < mVarA.a() || i11 > mVarA.c()) {
                    return;
                }
                if (materialCalendarGridView.a().getItem(i11).longValue() >= ((x10.i) ((x10.o) this.f25509c).f43710b.f28697a).f43659c.f43643c.f43648a) {
                    throw null;
                }
                return;
        }
    }
}
