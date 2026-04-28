package h20;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends o.l {
    public final int A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f21307z;

    public i(Context context, Class cls, int i11) {
        super(context);
        this.f21307z = cls;
        this.A = i11;
    }

    @Override // o.l
    public final o.n a(int i11, int i12, int i13, CharSequence charSequence) {
        int size = this.f31549f.size() + 1;
        int i14 = this.A;
        if (size <= i14) {
            y();
            o.n nVarA = super.a(i11, i12, i13, charSequence);
            x();
            return nVarA;
        }
        String simpleName = this.f21307z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i14);
        sb2.append(". Limit can be checked with ");
        i4.a.f(r8.k.p(sb2, simpleName, "#getMaxItemCount()"));
        return null;
    }

    @Override // o.l, android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f21307z.getSimpleName().concat(" does not support submenus"));
    }
}
