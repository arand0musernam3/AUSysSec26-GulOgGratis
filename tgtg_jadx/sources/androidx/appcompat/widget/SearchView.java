package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.BERTags;
import p.c3;
import p.e0;
import p.h2;
import p.i2;
import p.j2;
import p.k2;
import p.l2;
import p.m2;
import p.n2;
import p.o1;
import p.o2;
import p.p2;
import p.q2;
import p.s2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.b {

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final o2 f2049m1;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public w7.a O;
    public boolean P;
    public CharSequence Q;
    public boolean T;
    public boolean V;
    public int W;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f2050f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f2051g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f2052h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public SearchableInfo f2053h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Bundle f2054i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final h2 f2055j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final h2 f2056k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final WeakHashMap f2057l1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f2058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f2059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f2060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f2061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f2062t;
    public CharSequence t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f2063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f2064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f2065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f2066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q2 f2067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f2068z;

    static {
        o2 o2Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            o2 o2Var2 = new o2();
            o2Var2.f33962a = null;
            o2Var2.f33963b = null;
            o2Var2.f33964c = null;
            o2.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                o2Var2.f33962a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                o2Var2.f33963b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                o2Var2.f33964c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            o2Var = o2Var2;
        }
        f2049m1 = o2Var;
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2068z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f2055j1 = new h2(this, 0);
        int i12 = 1;
        this.f2056k1 = new h2(this, i12);
        this.f2057l1 = new WeakHashMap();
        c cVar = new c(this);
        d dVar = new d(this);
        k2 k2Var = new k2(this);
        e0 e0Var = new e0(this, i12);
        o1 o1Var = new o1(this, 1);
        fl.f fVar = new fl.f(this, 4);
        int[] iArr = j.a.f24273v;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        ViewCompat.a0(this, context, iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2058p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2059q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f2060r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f2061s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2062t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2063u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2064v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2065w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        ViewCompat.e0(viewFindViewById, gVarT.k(20));
        ViewCompat.e0(viewFindViewById2, gVarT.k(25));
        imageView.setImageDrawable(gVarT.k(23));
        imageView2.setImageDrawable(gVarT.k(15));
        imageView3.setImageDrawable(gVarT.k(12));
        imageView4.setImageDrawable(gVarT.k(28));
        imageView5.setImageDrawable(gVarT.k(23));
        this.E = gVarT.k(22);
        c3.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = typedArray.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(cVar);
        imageView3.setOnClickListener(cVar);
        imageView2.setOnClickListener(cVar);
        imageView4.setOnClickListener(cVar);
        searchAutoComplete.setOnClickListener(cVar);
        searchAutoComplete.addTextChangedListener(fVar);
        searchAutoComplete.setOnEditorActionListener(k2Var);
        searchAutoComplete.setOnItemClickListener(e0Var);
        searchAutoComplete.setOnItemSelectedListener(o1Var);
        searchAutoComplete.setOnKeyListener(dVar);
        searchAutoComplete.setOnFocusChangeListener(new i2(this));
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.J = typedArray.getText(14);
        this.Q = typedArray.getText(21);
        int i13 = typedArray.getInt(6, -1);
        if (i13 != -1) {
            setImeOptions(i13);
        }
        int i14 = typedArray.getInt(5, -1);
        if (i14 != -1) {
            setInputType(i14);
        }
        setFocusable(typedArray.getBoolean(1, true));
        gVarT.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2066x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new j2(this, 0));
        }
        w(this.M);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2058p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.V = false;
    }

    public int getImeOptions() {
        return this.f2058p.getImeOptions();
    }

    public int getInputType() {
        return this.f2058p.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.f2058p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2053h1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f2053h1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public w7.a getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.t0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2054i1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2053h1.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2054i1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i11 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2058p;
        if (i11 >= 29) {
            e.a(searchAutoComplete);
            return;
        }
        o2 o2Var = f2049m1;
        o2Var.getClass();
        o2.a();
        Method method = o2Var.f33962a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        o2Var.getClass();
        o2.a();
        Method method2 = o2Var.f33963b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f2058p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i11) {
        int position;
        String strG;
        Cursor cursor = this.O.f43272c;
        if (cursor != null && cursor.moveToPosition(i11)) {
            Intent intentJ = null;
            try {
                int i12 = s2.f34006x;
                String strG2 = s2.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strG2 == null) {
                    strG2 = this.f2053h1.getSuggestIntentAction();
                }
                if (strG2 == null) {
                    strG2 = "android.intent.action.SEARCH";
                }
                String strG3 = s2.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strG3 == null) {
                    strG3 = this.f2053h1.getSuggestIntentData();
                }
                if (strG3 != null && (strG = s2.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strG3 = strG3 + ExpiryDateInput.SEPARATOR + Uri.encode(strG);
                }
                intentJ = j(strG3 == null ? null : Uri.parse(strG3), strG2, s2.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), s2.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e5) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2058p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i11) {
        Editable text = this.f2058p.getText();
        Cursor cursor = this.O.f43272c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i11)) {
            setQuery(text);
            return;
        }
        String strC = this.O.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // androidx.appcompat.view.b
    public final void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        w(true);
        this.f2058p.setImeOptions(this.f2051g1);
        this.f2050f1 = false;
    }

    @Override // androidx.appcompat.view.b
    public final void onActionViewExpanded() {
        if (this.f2050f1) {
            return;
        }
        this.f2050f1 = true;
        SearchAutoComplete searchAutoComplete = this.f2058p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f2051g1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2055j1);
        post(this.f2056k1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            SearchAutoComplete searchAutoComplete = this.f2058p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i15 = iArr[1] - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i16;
            int height = searchAutoComplete.getHeight() + i15;
            Rect rect = this.f2068z;
            rect.set(i16, i15, width, height);
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = i14 - i12;
            Rect rect2 = this.A;
            rect2.set(i17, 0, i18, i19);
            q2 q2Var = this.f2067y;
            if (q2Var == null) {
                q2 q2Var2 = new q2(searchAutoComplete, rect2, rect);
                this.f2067y = q2Var2;
                setTouchDelegate(q2Var2);
            } else {
                q2Var.f33983b.set(rect2);
                Rect rect3 = q2Var.f33985d;
                rect3.set(rect2);
                int i21 = -q2Var.f33986e;
                rect3.inset(i21, i21);
                q2Var.f33984c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (this.N) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            int i14 = this.W;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i13 = this.W) > 0) {
            size = Math.min(i13, size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p2 p2Var = (p2) parcelable;
        super.onRestoreInstanceState(p2Var.f45418a);
        w(p2Var.f33979c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p2 p2Var = new p2(super.onSaveInstanceState());
        p2Var.f33979c = this.N;
        return p2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        post(this.f2055j1);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f2058p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f2053h1 != null) {
            getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f2058p.getText());
        int i11 = (!zIsEmpty || (this.M && !this.f2050f1)) ? 0 : 8;
        ImageView imageView = this.f2064v;
        imageView.setVisibility(i11);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (this.V || !isFocusable()) {
            return false;
        }
        if (this.N) {
            return super.requestFocus(i11, rect);
        }
        boolean zRequestFocus = this.f2058p.requestFocus(i11, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.f2058p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2060r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2061s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2054i1 = bundle;
    }

    public void setIconified(boolean z11) {
        if (z11) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f2058p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z11) {
        if (this.M == z11) {
            return;
        }
        this.M = z11;
        w(z11);
        t();
    }

    public void setImeOptions(int i11) {
        this.f2058p.setImeOptions(i11);
    }

    public void setInputType(int i11) {
        this.f2058p.setInputType(i11);
    }

    public void setMaxWidth(int i11) {
        this.W = i11;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z11) {
        SearchAutoComplete searchAutoComplete = this.f2058p;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.t0 = charSequence;
        }
        if (!z11 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        q();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z11) {
        this.T = z11;
        w7.a aVar = this.O;
        if (aVar instanceof s2) {
            ((s2) aVar).f34014p = z11 ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f2053h1 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f2058p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f2053h1
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f2053h1
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f2053h1
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            w7.a r7 = r6.O
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f2053h1
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            p.s2 r7 = new p.s2
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f2053h1
            java.util.WeakHashMap r5 = r6.f2057l1
            r7.<init>(r3, r6, r4, r5)
            r6.O = r7
            r2.setAdapter(r7)
            w7.a r7 = r6.O
            p.s2 r7 = (p.s2) r7
            boolean r3 = r6.T
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f34014p = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.f2053h1
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f2053h1
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f2053h1
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.I
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.f2052h0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.N
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z11) {
        this.P = z11;
        w(this.N);
    }

    public void setSuggestionsAdapter(w7.a aVar) {
        this.O = aVar;
        this.f2058p.setAdapter(aVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z11 = this.M;
        SearchAutoComplete searchAutoComplete = this.f2058p;
        CharSequence charSequence2 = charSequence;
        if (z11) {
            Drawable drawable = this.E;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.f2061s.setVisibility(((this.P || this.f2052h0) && !this.N && (this.f2063u.getVisibility() == 0 || this.f2065w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z11) {
        boolean z12 = this.P;
        this.f2063u.setVisibility((!z12 || !(z12 || this.f2052h0) || this.N || !hasFocus() || (!z11 && this.f2052h0)) ? 8 : 0);
    }

    public final void w(boolean z11) {
        this.N = z11;
        int i11 = 8;
        int i12 = z11 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f2058p.getText());
        this.f2062t.setVisibility(i12);
        v(!zIsEmpty);
        this.f2059q.setVisibility(z11 ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.M) ? 8 : 0);
        r();
        if (this.f2052h0 && !this.N && zIsEmpty) {
            this.f2063u.setVisibility(8);
            i11 = 0;
        }
        this.f2065w.setVisibility(i11);
        u();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f2070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final f f2072h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.f2072h = new f(this);
            this.f2069e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            if (i11 >= 960 && i12 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i11 >= 600) {
                return BERTags.PRIVATE;
            }
            if (i11 < 640 || i12 < 480) {
                return 160;
            }
            return BERTags.PRIVATE;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o2 o2Var = SearchView.f2049m1;
            o2Var.getClass();
            o2.a();
            Method method = o2Var.f33964c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f2069e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2071g) {
                f fVar = this.f2072h;
                removeCallbacks(fVar);
                post(fVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            SearchView searchView = this.f2070f;
            searchView.w(searchView.N);
            searchView.post(searchView.f2055j1);
            if (searchView.f2058p.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2070f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f2070f.hasFocus() && getVisibility() == 0) {
                this.f2071g = true;
                Context context = getContext();
                o2 o2Var = SearchView.f2049m1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            f fVar = this.f2072h;
            if (!z11) {
                this.f2071g = false;
                removeCallbacks(fVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f2071g = true;
                    return;
                }
                this.f2071g = false;
                removeCallbacks(fVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2070f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f2069e = i11;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(l2 l2Var) {
    }

    public void setOnQueryTextListener(m2 m2Var) {
    }

    public void setOnSuggestionListener(n2 n2Var) {
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f2058p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }
}
