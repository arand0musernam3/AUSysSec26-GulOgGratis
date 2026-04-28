package p;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import c5.f4;
import com.app.tgtg.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends w7.a implements View.OnClickListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f34006x = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f34008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f34009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SearchView f34010k;
    public final SearchableInfo l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f34011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WeakHashMap f34012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f34013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f34015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f34017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f34020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34021w;

    public s2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f43271b = true;
        this.f43272c = null;
        this.f43270a = false;
        this.f43273d = -1;
        this.f43274e = new f4(this);
        this.f43275f = new s1(this, 1);
        this.f34008i = suggestionRowLayout;
        this.f34007h = suggestionRowLayout;
        this.f34009j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f34014p = 1;
        this.f34016r = -1;
        this.f34017s = -1;
        this.f34018t = -1;
        this.f34019u = -1;
        this.f34020v = -1;
        this.f34021w = -1;
        this.f34010k = searchView;
        this.l = searchableInfo;
        this.f34013o = searchView.getSuggestionCommitIconResId();
        this.f34011m = context;
        this.f34012n = weakHashMap;
    }

    public static String g(Cursor cursor, int i11) {
        if (i11 == -1) {
            return null;
        }
        try {
            return cursor.getString(i11);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // w7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s2.a(android.view.View, android.database.Cursor):void");
    }

    @Override // w7.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f34016r = cursor.getColumnIndex("suggest_text_1");
                this.f34017s = cursor.getColumnIndex("suggest_text_2");
                this.f34018t = cursor.getColumnIndex("suggest_text_2_url");
                this.f34019u = cursor.getColumnIndex("suggest_icon_1");
                this.f34020v = cursor.getColumnIndex("suggest_icon_2");
                this.f34021w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // w7.a
    public final String c(Cursor cursor) {
        String strG;
        String strG2;
        if (cursor == null) {
            return null;
        }
        String strG3 = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strG3 != null) {
            return strG3;
        }
        SearchableInfo searchableInfo = this.l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strG2 = g(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strG2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strG = g(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strG;
    }

    public final Drawable d(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.f34011m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable e(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s2.e(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor f(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f34011m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // w7.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i11, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f34009j.inflate(this.f34008i, viewGroup, false);
            if (viewInflate != null) {
                ((r2) viewInflate.getTag()).f33994a.setText(e5.toString());
            }
            return viewInflate;
        }
    }

    @Override // w7.a, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i11, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewInflate = this.f34009j.inflate(this.f34007h, viewGroup, false);
            viewInflate.setTag(new r2(viewInflate));
            ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f34013o);
            ((r2) viewInflate.getTag()).f33994a.setText(e5.toString());
            return viewInflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f43272c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f43272c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f34010k.p((CharSequence) tag);
        }
    }
}
