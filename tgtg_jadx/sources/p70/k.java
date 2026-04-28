package p70;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LayoutInflater f34552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f34553b;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(LayoutInflater layoutInflater, Fragment fragment) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        ea.b bVar = new ea.b(this, 5);
        this.f34552a = layoutInflater;
        fragment.getClass();
        fragment.getLifecycle().a(bVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f34553b == null) {
            if (this.f34552a == null) {
                this.f34552a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f34553b = this.f34552a.cloneInContext(this);
        }
        return this.f34553b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        ea.b bVar = new ea.b(this, 5);
        this.f34552a = null;
        fragment.getClass();
        fragment.getLifecycle().a(bVar);
    }
}
