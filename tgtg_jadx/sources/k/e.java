package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.app.tgtg.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final d9.a E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f25535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f25536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f25538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f25539g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f25541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f25542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f25543k;
    public Button l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f25544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f25545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f25546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f25547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f25548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f25549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f25550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f25551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f25552u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f25553v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f25554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f25555x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f25557z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25540h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f25556y = -1;
    public final e20.m F = new e20.m(this, 2);

    public e(Context context, f fVar, Window window) {
        this.f25533a = context;
        this.f25534b = fVar;
        this.f25535c = window;
        d9.a aVar = new d9.a();
        aVar.f14754b = new WeakReference(fVar);
        this.E = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.a.f24257e, R.attr.alertDialogStyle, 0);
        this.f25557z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fVar.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
