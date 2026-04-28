package w7;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import c5.f4;
import com.app.tgtg.R;
import com.braze.h2;
import j4.s;
import p.r2;
import p.s1;
import p.s2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f43272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f4 f43274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f43275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f43276g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f43272c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                f4 f4Var = this.f43274e;
                if (f4Var != null) {
                    cursor2.unregisterContentObserver(f4Var);
                }
                s1 s1Var = this.f43275f;
                if (s1Var != null) {
                    cursor2.unregisterDataSetObserver(s1Var);
                }
            }
            this.f43272c = cursor;
            if (cursor != null) {
                f4 f4Var2 = this.f43274e;
                if (f4Var2 != null) {
                    cursor.registerContentObserver(f4Var2);
                }
                s1 s1Var2 = this.f43275f;
                if (s1Var2 != null) {
                    cursor.registerDataSetObserver(s1Var2);
                }
                this.f43273d = cursor.getColumnIndexOrThrow("_id");
                this.f43270a = true;
                notifyDataSetChanged();
            } else {
                this.f43273d = -1;
                this.f43270a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f43270a || (cursor = this.f43272c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f43270a) {
            return null;
        }
        this.f43272c.moveToPosition(i11);
        if (view == null) {
            s2 s2Var = (s2) this;
            view = s2Var.f34009j.inflate(s2Var.f34008i, viewGroup, false);
        }
        a(view, this.f43272c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f43276g == null) {
            b bVar = new b();
            bVar.f43277a = this;
            this.f43276g = bVar;
        }
        return this.f43276g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        Cursor cursor;
        if (!this.f43270a || (cursor = this.f43272c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f43272c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        Cursor cursor;
        if (this.f43270a && (cursor = this.f43272c) != null && cursor.moveToPosition(i11)) {
            return this.f43272c.getLong(this.f43273d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f43270a) {
            h2.b("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.f43272c.moveToPosition(i11)) {
            h2.b(s.f(i11, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            s2 s2Var = (s2) this;
            view = s2Var.f34009j.inflate(s2Var.f34007h, viewGroup, false);
            view.setTag(new r2(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(s2Var.f34013o);
        }
        a(view, this.f43272c);
        return view;
    }
}
