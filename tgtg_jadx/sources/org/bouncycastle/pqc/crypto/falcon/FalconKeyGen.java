package org.bouncycastle.pqc.crypto.falcon;

import com.app.tgtg.model.local.AppConstants;
import j4.s;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class FalconKeyGen {
    private static final int DEPTH_INT_FG = 4;
    private static final short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    private static final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    private static final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, 209};
    private static final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, 157, 308};
    private static final int[] bitlength_avg = {4, 11, 24, 50, 102, AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, AppConstants.STATUS_CODE_UNAUTHORIZED, 794, 1577, 3138, 6308};
    private static final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};

    private static long get_rng_u64(SHAKEDigest sHAKEDigest) {
        byte[] bArr = new byte[8];
        sHAKEDigest.doOutput(bArr, 0, 8);
        return Pack.littleEndianToLong(bArr, 0);
    }

    public static void keygen(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr, int i11) {
        int i12;
        int i13;
        byte b8;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        int i14 = i11;
        int iMkn = mkn(i14);
        short[] sArr2 = sArr;
        while (true) {
            double[] dArr = new double[iMkn * 3];
            poly_small_mkgauss(sHAKEDigest, bArr4, i14);
            poly_small_mkgauss(sHAKEDigest, bArr5, i14);
            int i15 = 1 << (FalconCodec.max_fg_bits[i14] - 1);
            for (int i16 = 0; i16 < iMkn; i16++) {
                byte b11 = bArr4[i16];
                if (b11 >= i15 || b11 <= (i13 = -i15) || (b8 = bArr5[i16]) >= i15 || b8 <= i13) {
                    i15 = -1;
                    break;
                }
            }
            if (i15 >= 0) {
                int iPoly_small_sqnorm = poly_small_sqnorm(bArr4, i14);
                int iPoly_small_sqnorm2 = poly_small_sqnorm(bArr5, i14);
                if ((((long) ((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2))) & 4294967295L) >= 16823) {
                    continue;
                } else {
                    int i17 = iMkn + iMkn;
                    poly_small_to_fp(dArr, 0, bArr4, i14);
                    poly_small_to_fp(dArr, iMkn, bArr5, i14);
                    FalconFFT.FFT(dArr, 0, i14);
                    FalconFFT.FFT(dArr, iMkn, i14);
                    FalconFFT.poly_invnorm2_fft(dArr, i17, dArr, 0, dArr, iMkn, i14);
                    FalconFFT.poly_adj_fft(dArr, 0, i14);
                    FalconFFT.poly_adj_fft(dArr, iMkn, i14);
                    FalconFFT.poly_mulconst(dArr, 0, 12289.0d, i14);
                    FalconFFT.poly_mulconst(dArr, iMkn, 12289.0d, i14);
                    FalconFFT.poly_mul_autoadj_fft(dArr, 0, dArr, i17, i14);
                    FalconFFT.poly_mul_autoadj_fft(dArr, iMkn, dArr, i17, i14);
                    FalconFFT.iFFT(dArr, 0, i14);
                    FalconFFT.iFFT(dArr, iMkn, i14);
                    double d3 = 0.0d;
                    for (int i18 = 0; i18 < iMkn; i18++) {
                        double d11 = dArr[i18];
                        double d12 = dArr[iMkn + i18];
                        d3 += (d12 * d12) + (d11 * d11);
                    }
                    if (d3 >= 16822.4121d) {
                        continue;
                    } else {
                        short[] sArr3 = new short[iMkn * 2];
                        if (sArr2 == null) {
                            sArr2 = sArr3;
                            i12 = iMkn;
                        } else {
                            i12 = 0;
                        }
                        int iCompute_public = FalconVrfy.compute_public(sArr2, 0, bArr4, bArr5, i14, sArr3, i12);
                        short[] sArr4 = sArr2;
                        if (iCompute_public != 0) {
                            if (solve_NTRU(i14, bArr3, bArr, bArr2, (1 << (FalconCodec.max_FG_bits[i14] - 1)) - 1, new int[i14 > 2 ? iMkn * 28 : iMkn * 84]) != 0) {
                                return;
                            }
                        }
                        bArr4 = bArr;
                        bArr5 = bArr2;
                        i14 = i11;
                        sArr2 = sArr4;
                    }
                }
            }
        }
    }

    private static void make_fg(int[] iArr, int i11, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        int iMkn = mkn(i12);
        int i15 = i11 + iMkn;
        int i16 = FalconSmallPrimeList.PRIMES[0].f33488p;
        for (int i17 = 0; i17 < iMkn; i17++) {
            iArr[i11 + i17] = modp_set(bArr[i17], i16);
            iArr[i15 + i17] = modp_set(bArr2[i17], i16);
        }
        if (i13 != 0 || i14 == 0) {
            int i18 = 0;
            while (i18 < i13) {
                int i19 = i18 + 1;
                make_fg_step(iArr, i11, i12 - i18, i18, i18 != 0 ? 1 : 0, (i19 < i13 || i14 != 0) ? 1 : 0);
                i18 = i19;
            }
            return;
        }
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i21 = falconSmallPrimeArr[0].f33488p;
        int iModp_ninv31 = modp_ninv31(i21);
        int i22 = i15 + iMkn;
        modp_mkgm2(iArr, i22, iArr, i22 + iMkn, i12, falconSmallPrimeArr[0].f33487g, i21, iModp_ninv31);
        modp_NTT2(iArr, i11, iArr, i22, i12, i21, iModp_ninv31);
        modp_NTT2(iArr, i15, iArr, i22, i12, i21, iModp_ninv31);
    }

    private static void make_fg_step(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int[] iArr2 = iArr;
        boolean z11 = true;
        int i26 = 1 << i12;
        int i27 = i26 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i28 = iArr3[i13];
        int i29 = iArr3[i13 + 1];
        int i31 = i27 * i29;
        int i32 = i11 + i31;
        int i33 = i32 + i31;
        int i34 = i26 * i28;
        int i35 = i33 + i34;
        int i36 = i35 + i34;
        int i37 = i36 + i26;
        int i38 = i37 + i26;
        System.arraycopy(iArr2, i11, iArr2, i33, i26 * 2 * i28);
        int i39 = 0;
        while (i39 < i28) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i41 = falconSmallPrimeArr[i39].f33488p;
            int iModp_ninv31 = modp_ninv31(i41);
            int iModp_R2 = modp_R2(i41, iModp_ninv31);
            int i42 = falconSmallPrimeArr[i39].f33487g;
            boolean z12 = z11;
            int i43 = i39;
            int i44 = i36;
            int i45 = i37;
            modp_mkgm2(iArr2, i44, iArr, i45, i12, i42, i41, iModp_ninv31);
            int i46 = iModp_ninv31;
            int i47 = i33 + i43;
            int i48 = 0;
            int i49 = i47;
            while (i48 < i26) {
                iArr[i38 + i48] = iArr[i49];
                i48++;
                i49 += i28;
            }
            if (i14 == 0) {
                int i51 = i38;
                modp_NTT2(iArr, i51, iArr, i44, i12, i41, i46);
                i18 = i51;
                i46 = i46;
                i41 = i41;
            } else {
                i18 = i38;
            }
            int i52 = i11 + i43;
            int i53 = 0;
            int i54 = i52;
            while (i53 < i27) {
                int i55 = i18 + (i53 << 1);
                iArr[i54] = modp_montymul(modp_montymul(iArr[i55], iArr[i55 + 1], i41, i46), iModp_R2, i41, i46);
                i53++;
                i54 += i29;
            }
            if (i14 != 0) {
                int i56 = i28;
                int i57 = i46;
                modp_iNTT2_ext(iArr, i47, i56, iArr, i45, i12, i41, i57);
                i19 = i45;
                i46 = i57;
                i21 = i56;
            } else {
                int i58 = i28;
                i19 = i45;
                i21 = i58;
            }
            int i59 = i35 + i43;
            int i61 = 0;
            int i62 = i59;
            while (i61 < i26) {
                iArr[i18 + i61] = iArr[i62];
                i61++;
                i62 += i21;
            }
            if (i14 == 0) {
                int i63 = i41;
                int i64 = i46;
                modp_NTT2(iArr, i18, iArr, i44, i12, i63, i64);
                i46 = i64;
                i41 = i63;
            }
            int i65 = i32 + i43;
            int i66 = 0;
            int i67 = i65;
            while (i66 < i27) {
                int i68 = i18 + (i66 << 1);
                iArr[i67] = modp_montymul(modp_montymul(iArr[i68], iArr[i68 + 1], i41, i46), iModp_R2, i41, i46);
                i66++;
                i67 += i29;
            }
            if (i14 != 0) {
                int i69 = i21;
                i23 = i19;
                i24 = i46;
                modp_iNTT2_ext(iArr, i59, i69, iArr, i23, i12, i41, i24);
                i22 = i69;
            } else {
                i22 = i21;
                i23 = i19;
                i24 = i46;
            }
            if (i15 == 0) {
                int i71 = i12 - 1;
                int i72 = i29;
                modp_iNTT2_ext(iArr, i52, i72, iArr, i23, i71, i41, i24);
                modp_iNTT2_ext(iArr, i65, i72, iArr, i23, i71, i41, i24);
                i25 = i72;
            } else {
                i25 = i29;
            }
            i39 = i43 + 1;
            iArr2 = iArr;
            i37 = i23;
            i36 = i44;
            i38 = i18;
            i29 = i25;
            i28 = i22;
            z11 = z12;
        }
        int i73 = i28;
        int i74 = i29;
        int i75 = i38;
        int i76 = i36;
        int i77 = i37;
        zint_rebuild_CRT(iArr, i33, i73, i73, i26, 1, iArr, i76);
        zint_rebuild_CRT(iArr, i35, i73, i73, i26, 1, iArr, i76);
        int i78 = i76;
        int i79 = i73;
        while (i79 < i74) {
            FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
            int i81 = falconSmallPrimeArr2[i79].f33488p;
            int iModp_ninv312 = modp_ninv31(i81);
            int iModp_R22 = modp_R2(i81, iModp_ninv312);
            int iModp_Rx = modp_Rx(i73, i81, iModp_ninv312, iModp_R22);
            int i82 = falconSmallPrimeArr2[i79].f33487g;
            int i83 = iModp_R22;
            int i84 = i78;
            int i85 = i77;
            int i86 = i79;
            modp_mkgm2(iArr, i84, iArr, i85, i12, i82, i81, iModp_ninv312);
            int i87 = i33;
            int i88 = 0;
            while (i88 < i26) {
                int i89 = i81;
                int i91 = i73;
                int i92 = iModp_Rx;
                int i93 = i83;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr, i87, i91, i89, iModp_ninv312, i93, i92);
                i81 = i89;
                iArr[i75 + i88] = iZint_mod_small_signed;
                i88++;
                i87 += i91;
                i73 = i91;
                iModp_Rx = i92;
                i83 = i93;
            }
            int i94 = iModp_Rx;
            int i95 = i83;
            int i96 = i73;
            int i97 = i95;
            int i98 = i81;
            modp_NTT2(iArr, i75, iArr, i84, i12, i98, iModp_ninv312);
            int i99 = i98;
            int i100 = i11 + i86;
            int i101 = i100;
            int i102 = 0;
            while (i102 < i27) {
                int i103 = i75 + (i102 << 1);
                iArr[i101] = modp_montymul(modp_montymul(iArr[i103], iArr[i103 + 1], i99, iModp_ninv312), i97, i99, iModp_ninv312);
                i102++;
                i101 += i74;
            }
            int i104 = i35;
            for (int i105 = 0; i105 < i26; i105++) {
                int i106 = i99;
                int i107 = i97;
                int i108 = i96;
                int i109 = i94;
                int iZint_mod_small_signed2 = zint_mod_small_signed(iArr, i104, i108, i106, iModp_ninv312, i107, i109);
                i99 = i106;
                iArr[i75 + i105] = iZint_mod_small_signed2;
                i104 += i108;
                i97 = i107;
                i96 = i108;
                i94 = i109;
            }
            int i110 = i96;
            int i111 = i99;
            modp_NTT2(iArr, i75, iArr, i84, i12, i111, iModp_ninv312);
            int i112 = i32 + i86;
            int i113 = 0;
            int i114 = i112;
            while (i113 < i27) {
                int i115 = i75 + (i113 << 1);
                iArr[i114] = modp_montymul(modp_montymul(iArr[i115], iArr[i115 + 1], i111, iModp_ninv312), i97, i111, iModp_ninv312);
                i113++;
                i114 += i74;
            }
            if (i15 == 0) {
                int i116 = i12 - 1;
                i16 = i74;
                i17 = i85;
                modp_iNTT2_ext(iArr, i100, i16, iArr, i17, i116, i111, iModp_ninv312);
                modp_iNTT2_ext(iArr, i112, i16, iArr, i17, i116, i111, iModp_ninv312);
            } else {
                i16 = i74;
                i17 = i85;
            }
            i79 = i86 + 1;
            i74 = i16;
            i77 = i17;
            i78 = i84;
            i73 = i110;
        }
    }

    private static int mkgauss(SHAKEDigest sHAKEDigest, int i11) {
        int i12 = 1 << (10 - i11);
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long j9 = get_rng_u64(sHAKEDigest);
            int i15 = (int) (j9 >>> 63);
            int i16 = (int) (((j9 & LongCompanionObject.MAX_VALUE) - gauss_1024_12289[0]) >>> 63);
            long j11 = LongCompanionObject.MAX_VALUE & get_rng_u64(sHAKEDigest);
            int i17 = 1;
            int i18 = 0;
            while (true) {
                long[] jArr = gauss_1024_12289;
                if (i17 < jArr.length) {
                    int i19 = ((int) ((j11 - jArr[i17]) >>> 63)) ^ 1;
                    i18 |= (-((i16 ^ 1) & i19)) & i17;
                    i16 |= i19;
                    i17++;
                }
            }
            i13 += ((-i15) ^ i18) + i15;
        }
        return i13;
    }

    private static int mkn(int i11) {
        return 1 << i11;
    }

    private static void modp_NTT2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        modp_NTT2_ext(iArr, i11, 1, iArr2, i12, i13, i14, i15);
    }

    private static void modp_NTT2_ext(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        if (i14 == 0) {
            return;
        }
        int iMkn = mkn(i14);
        int i17 = 1;
        int i18 = iMkn;
        while (i17 < iMkn) {
            int i19 = i18 >> 1;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i17) {
                int i23 = iArr2[i13 + i17 + i21];
                int i24 = (i22 * i12) + i11;
                int i25 = (i19 * i12) + i24;
                int i26 = 0;
                while (i26 < i19) {
                    int i27 = iArr[i24];
                    int iModp_montymul = modp_montymul(iArr[i25], i23, i15, i16);
                    iArr[i24] = modp_add(i27, iModp_montymul, i15);
                    iArr[i25] = modp_sub(i27, iModp_montymul, i15);
                    i26++;
                    i24 += i12;
                    i25 += i12;
                }
                i21++;
                i22 += i18;
            }
            i17 <<= 1;
            i18 = i19;
        }
    }

    private static int modp_R(int i11) {
        return Integer.MIN_VALUE - i11;
    }

    private static int modp_R2(int i11, int i12) {
        int iModp_R = modp_R(i11);
        int iModp_add = modp_add(iModp_R, iModp_R, i11);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i11, i12);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i11, i12);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i11, i12);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i11, i12);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i11, i12);
        return (iModp_montymul5 + (i11 & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    private static int modp_Rx(int i11, int i12, int i13, int i14) {
        int i15 = i11 - 1;
        int iModp_R = modp_R(i12);
        int i16 = 0;
        while (true) {
            int i17 = 1 << i16;
            if (i17 > i15) {
                return iModp_R;
            }
            if ((i17 & i15) != 0) {
                iModp_R = modp_montymul(iModp_R, i14, i12, i13);
            }
            i14 = modp_montymul(i14, i14, i12, i13);
            i16++;
        }
    }

    private static int modp_add(int i11, int i12, int i13) {
        int i14 = (i11 + i12) - i13;
        return i14 + ((-(i14 >>> 31)) & i13);
    }

    private static int modp_div(int i11, int i12, int i13, int i14, int i15) {
        int i16 = i13 - 2;
        for (int i17 = 30; i17 >= 0; i17--) {
            int iModp_montymul = modp_montymul(i15, i15, i13, i14);
            i15 = iModp_montymul ^ ((-(1 & (i16 >>> i17))) & (modp_montymul(iModp_montymul, i12, i13, i14) ^ iModp_montymul));
        }
        return modp_montymul(i11, modp_montymul(i15, 1, i13, i14), i13, i14);
    }

    private static void modp_iNTT2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15) {
        modp_iNTT2_ext(iArr, i11, 1, iArr2, i12, i13, i14, i15);
    }

    private static void modp_iNTT2_ext(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        int i17;
        if (i14 == 0) {
            return;
        }
        int iMkn = mkn(i14);
        int i18 = iMkn;
        int i19 = 1;
        while (true) {
            i17 = 0;
            if (i18 <= 1) {
                break;
            }
            i18 >>= 1;
            int i21 = i19 << 1;
            int i22 = 0;
            int i23 = 0;
            while (i22 < i18) {
                int i24 = iArr2[i13 + i18 + i22];
                int i25 = (i23 * i12) + i11;
                int i26 = (i19 * i12) + i25;
                int i27 = 0;
                while (i27 < i19) {
                    int i28 = iArr[i25];
                    int i29 = iArr[i26];
                    iArr[i25] = modp_add(i28, i29, i15);
                    iArr[i26] = modp_montymul(modp_sub(i28, i29, i15), i24, i15, i16);
                    i27++;
                    i25 += i12;
                    i26 += i12;
                }
                i22++;
                i23 += i21;
            }
            i19 = i21;
        }
        int i31 = 1 << (31 - i14);
        int i32 = i11;
        while (i17 < iMkn) {
            iArr[i32] = modp_montymul(iArr[i32], i31, i15, i16);
            i17++;
            i32 += i12;
        }
    }

    private static void modp_mkgm2(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14, int i15, int i16) {
        int iMkn = mkn(i13);
        int iModp_R2 = modp_R2(i15, i16);
        int iModp_montymul = modp_montymul(i14, iModp_R2, i15, i16);
        for (int i17 = i13; i17 < 10; i17++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i15, i16);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i15, i16, modp_R(i15));
        int i18 = 10 - i13;
        int iModp_R = modp_R(i15);
        int iModp_montymul2 = iModp_R;
        for (int i19 = 0; i19 < iMkn; i19++) {
            short s7 = REV10[i19 << i18];
            iArr[i11 + s7] = iModp_R;
            iArr2[s7 + i12] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i15, i16);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i15, i16);
        }
    }

    private static int modp_montymul(int i11, int i12, int i13, int i14) {
        long unsignedLong = toUnsignedLong(i11) * toUnsignedLong(i12);
        int i15 = ((int) (((((((long) i14) * unsignedLong) & 2147483647L) * ((long) i13)) + unsignedLong) >>> 31)) - i13;
        return i15 + ((-(i15 >>> 31)) & i13);
    }

    private static int modp_ninv31(int i11) {
        int i12 = 2 - i11;
        int i13 = (2 - (i11 * i12)) * i12;
        int i14 = (2 - (i11 * i13)) * i13;
        int i15 = (2 - (i11 * i14)) * i14;
        return (-((2 - (i11 * i15)) * i15)) & Integer.MAX_VALUE;
    }

    private static int modp_norm(int i11, int i12) {
        return i11 - (i12 & (((i11 - ((i12 + 1) >>> 1)) >>> 31) - 1));
    }

    private static void modp_poly_rec_res(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 1 << (i12 - 1);
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (i17 << 1) + i11;
            iArr[i11 + i17] = modp_montymul(modp_montymul(iArr[i18], iArr[i18 + 1], i13, i14), i15, i13, i14);
        }
    }

    private static int modp_set(int i11, int i12) {
        return i11 + (i12 & (-(i11 >>> 31)));
    }

    private static int modp_sub(int i11, int i12, int i13) {
        int i14 = i11 - i12;
        return i14 + ((-(i14 >>> 31)) & i13);
    }

    private static void poly_big_to_fp(double[] dArr, int[] iArr, int i11, int i12, int i13, int i14) {
        int iMkn = mkn(i14);
        double d3 = 0.0d;
        if (i12 == 0) {
            for (int i15 = 0; i15 < iMkn; i15++) {
                dArr[i15] = 0.0d;
            }
            return;
        }
        int i16 = i11;
        int i17 = 0;
        while (i17 < iMkn) {
            int i18 = -(iArr[(i16 + i12) - 1] >>> 30);
            int i19 = i18 >>> 1;
            int i21 = i18 & 1;
            double d11 = 1.0d;
            double d12 = d3;
            int i22 = 0;
            while (i22 < i12) {
                int i23 = (iArr[i16 + i22] ^ i19) + i21;
                i21 = i23 >>> 31;
                int i24 = i23 & Integer.MAX_VALUE;
                d12 += ((double) (i24 - ((i24 << 1) & i18))) * d11;
                i22++;
                d11 *= 2.147483648E9d;
            }
            dArr[i17] = d12;
            i17++;
            i16 += i13;
            d3 = 0.0d;
        }
    }

    private static int poly_big_to_small(byte[] bArr, int i11, int[] iArr, int i12, int i13, int i14) {
        int iMkn = mkn(i14);
        for (int i15 = 0; i15 < iMkn; i15++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i12 + i15);
            if (iZint_one_to_plain < (-i13) || iZint_one_to_plain > i13) {
                return 0;
            }
            bArr[i11 + i15] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    private static void poly_small_mkgauss(SHAKEDigest sHAKEDigest, byte[] bArr, int i11) {
        int iMkgauss;
        int iMkn = mkn(i11);
        int i12 = 0;
        for (int i13 = 0; i13 < iMkn; i13++) {
            while (true) {
                iMkgauss = mkgauss(sHAKEDigest, i11);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i13 != iMkn - 1) {
                        i12 ^= iMkgauss & 1;
                        break;
                    } else if (((iMkgauss & 1) ^ i12) == 0) {
                    }
                }
            }
            bArr[i13] = (byte) iMkgauss;
        }
    }

    private static int poly_small_sqnorm(byte[] bArr, int i11) {
        int iMkn = mkn(i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iMkn; i14++) {
            byte b8 = bArr[i14];
            i12 += b8 * b8;
            i13 |= i12;
        }
        return (-(i13 >>> 31)) | i12;
    }

    private static void poly_small_to_fp(double[] dArr, int i11, byte[] bArr, int i12) {
        int iMkn = mkn(i12);
        for (int i13 = 0; i13 < iMkn; i13++) {
            dArr[i11 + i13] = bArr[i13];
        }
    }

    private static void poly_sub_scaled(int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14, int i15, int i16, int[] iArr3, int i17, int i18, int i19) {
        int iMkn = mkn(i19);
        for (int i21 = 0; i21 < iMkn; i21++) {
            int i22 = i14;
            int i23 = -iArr3[i21];
            int i24 = (i21 * i13) + i11;
            for (int i25 = 0; i25 < iMkn; i25++) {
                zint_add_scaled_mul_small(iArr, i24, i12, iArr2, i22, i15, i23, i17, i18);
                if (i21 + i25 == iMkn - 1) {
                    i24 = i11;
                    i23 = -i23;
                } else {
                    i24 += i13;
                }
                i22 += i16;
            }
        }
    }

    private static void poly_sub_scaled_ntt(int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14, int i15, int i16, int[] iArr3, int i17, int i18, int i19, int[] iArr4, int i21) {
        int i22 = i15;
        int iMkn = mkn(i19);
        int i23 = i22 + 1;
        int iMkn2 = i21 + mkn(i19);
        int iMkn3 = iMkn2 + mkn(i19);
        int i24 = (iMkn * i23) + iMkn3;
        int i25 = 0;
        while (i25 < i23) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i26 = falconSmallPrimeArr[i25].f33488p;
            int iModp_ninv31 = modp_ninv31(i26);
            int iModp_R2 = modp_R2(i26, iModp_ninv31);
            int iModp_Rx = modp_Rx(i22, i26, iModp_ninv31, iModp_R2);
            int i27 = iMkn2;
            modp_mkgm2(iArr4, i21, iArr4, i27, i19, falconSmallPrimeArr[i25].f33487g, i26, iModp_ninv31);
            for (int i28 = 0; i28 < iMkn; i28++) {
                iArr4[i24 + i28] = modp_set(iArr3[i28], i26);
            }
            modp_NTT2(iArr4, i24, iArr4, i21, i19, i26, iModp_ninv31);
            int i29 = iMkn3 + i25;
            int i31 = i14;
            int i32 = i29;
            int i33 = 0;
            while (i33 < iMkn) {
                iArr4[i32] = zint_mod_small_signed(iArr2, i31, i22, i26, iModp_ninv31, iModp_R2, iModp_Rx);
                i33++;
                i31 += i16;
                i32 += i23;
                i22 = i15;
            }
            int i34 = i25;
            modp_NTT2_ext(iArr4, i29, i23, iArr4, i21, i19, i26, iModp_ninv31);
            int i35 = i29;
            int i36 = 0;
            while (i36 < iMkn) {
                iArr4[i35] = modp_montymul(modp_montymul(iArr4[i24 + i36], iArr4[i35], i26, iModp_ninv31), iModp_R2, i26, iModp_ninv31);
                i36++;
                i35 += i23;
            }
            iMkn2 = i27;
            modp_iNTT2_ext(iArr4, i29, i23, iArr4, iMkn2, i19, i26, iModp_ninv31);
            i25 = i34 + 1;
            i22 = i15;
        }
        zint_rebuild_CRT(iArr4, iMkn3, i23, i23, iMkn, 1, iArr4, i24);
        int i37 = i11;
        int i38 = iMkn3;
        int i39 = 0;
        while (i39 < iMkn) {
            int i41 = i23;
            zint_sub_scaled(iArr, i37, i12, iArr4, i38, i41, i17, i18);
            i23 = i41;
            i39++;
            i37 += i13;
            i38 += i23;
        }
    }

    private static int solve_NTRU(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, int i12, int[] iArr) {
        int iMkn = mkn(i11);
        if (solve_NTRU_deepest(i11, bArr2, bArr3, iArr) == 0) {
            return 0;
        }
        if (i11 <= 2) {
            int i13 = i11;
            while (true) {
                int i14 = i13 - 1;
                if (i13 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i11, bArr2, bArr3, i14, iArr) == 0) {
                    return 0;
                }
                i13 = i14;
            }
        } else {
            int i15 = i11;
            while (true) {
                int i16 = i15 - 1;
                if (i15 > 2) {
                    if (solve_NTRU_intermediate(i11, bArr2, bArr3, i16, iArr) == 0) {
                        return 0;
                    }
                    i15 = i16;
                } else if (solve_NTRU_binary_depth1(i11, bArr2, bArr3, iArr) == 0 || solve_NTRU_binary_depth0(i11, bArr2, bArr3, iArr) == 0) {
                    return 0;
                }
            }
        }
        byte[] bArr4 = new byte[iMkn];
        if (poly_big_to_small(bArr, 0, iArr, 0, i12, i11) == 0 || poly_big_to_small(bArr4, 0, iArr, iMkn, i12, i11) == 0) {
            return 0;
        }
        int i17 = iMkn + iMkn;
        int i18 = i17 + iMkn;
        int i19 = i18 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i21 = falconSmallPrimeArr[0].f33488p;
        int iModp_ninv31 = modp_ninv31(i21);
        modp_mkgm2(iArr, i19, iArr, 0, i11, falconSmallPrimeArr[0].f33487g, i21, iModp_ninv31);
        for (int i22 = 0; i22 < iMkn; i22++) {
            iArr[i22] = modp_set(bArr4[i22], i21);
        }
        for (int i23 = 0; i23 < iMkn; i23++) {
            iArr[iMkn + i23] = modp_set(bArr2[i23], i21);
            iArr[i17 + i23] = modp_set(bArr3[i23], i21);
            iArr[i18 + i23] = modp_set(bArr[i23], i21);
        }
        modp_NTT2(iArr, iMkn, iArr, i19, i11, i21, iModp_ninv31);
        modp_NTT2(iArr, i17, iArr, i19, i11, i21, iModp_ninv31);
        modp_NTT2(iArr, i18, iArr, i19, i11, i21, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i19, i11, i21, iModp_ninv31);
        int iModp_montymul = modp_montymul(12289, 1, i21, iModp_ninv31);
        for (int i24 = 0; i24 < iMkn; i24++) {
            if (modp_sub(modp_montymul(iArr[iMkn + i24], iArr[i24], i21, iModp_ninv31), modp_montymul(iArr[i17 + i24], iArr[i18 + i24], i21, iModp_ninv31), i21) != iModp_montymul) {
                return 0;
            }
        }
        return 1;
    }

    private static int solve_NTRU_binary_depth0(int i11, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i12 = 1;
        int i13 = 1 << i11;
        int i14 = i13 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i15 = 0;
        int i16 = falconSmallPrimeArr[0].f33488p;
        int iModp_ninv31 = modp_ninv31(i16);
        int iModp_R2 = modp_R2(i16, iModp_ninv31);
        int i17 = i14 + i14;
        int i18 = i17 + i13;
        int i19 = i18 + i13;
        int i21 = i19 + i13;
        modp_mkgm2(iArr, i19, iArr, i21, i11, falconSmallPrimeArr[0].f33487g, i16, iModp_ninv31);
        for (int i22 = 0; i22 < i14; i22++) {
            iArr[i22] = modp_set(zint_one_to_plain(iArr, i22), i16);
            int i23 = i14 + i22;
            iArr[i23] = modp_set(zint_one_to_plain(iArr, i23), i16);
        }
        int i24 = i11 - 1;
        modp_NTT2(iArr, 0, iArr, i19, i24, i16, iModp_ninv31);
        modp_NTT2(iArr, i14, iArr, i19, i24, i16, iModp_ninv31);
        for (int i25 = 0; i25 < i13; i25++) {
            iArr[i17 + i25] = modp_set(bArr[i25], i16);
            iArr[i18 + i25] = modp_set(bArr2[i25], i16);
        }
        modp_NTT2(iArr, i17, iArr, i19, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i18, iArr, i19, i11, i16, iModp_ninv31);
        int i26 = 0;
        while (i26 < i13) {
            int i27 = i17 + i26;
            int i28 = iArr[i27];
            int i29 = i27 + 1;
            int i31 = iArr[i29];
            int i32 = i18 + i26;
            int i33 = i12;
            int i34 = iArr[i32];
            int i35 = i32 + 1;
            int i36 = i15;
            int i37 = iArr[i35];
            int i38 = i26 >> 1;
            int iModp_montymul = modp_montymul(iArr[i38], iModp_R2, i16, iModp_ninv31);
            int i39 = i26;
            int iModp_montymul2 = modp_montymul(iArr[i14 + i38], iModp_R2, i16, iModp_ninv31);
            iArr[i27] = modp_montymul(i37, iModp_montymul, i16, iModp_ninv31);
            iArr[i29] = modp_montymul(i34, iModp_montymul, i16, iModp_ninv31);
            iArr[i32] = modp_montymul(i31, iModp_montymul2, i16, iModp_ninv31);
            iArr[i35] = modp_montymul(i28, iModp_montymul2, i16, iModp_ninv31);
            i26 = i39 + 2;
            i12 = i33;
            i15 = i36;
        }
        int i41 = i12;
        int i42 = i15;
        modp_iNTT2(iArr, i17, iArr, i21, i11, i16, iModp_ninv31);
        modp_iNTT2(iArr, i18, iArr, i21, i11, i16, iModp_ninv31);
        int i43 = i13 + i13;
        System.arraycopy(iArr, i17, iArr, 0, i13 * 2);
        int i44 = i43 + i13;
        int i45 = i44 + i13;
        int i46 = i45 + i13;
        int i47 = i46 + i13;
        modp_mkgm2(iArr, i43, iArr, i44, i11, FalconSmallPrimeList.PRIMES[i42].f33487g, i16, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i43, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i13, iArr, i43, i11, i16, iModp_ninv31);
        int iModp_set = modp_set(bArr[i42], i16);
        iArr[i47] = iModp_set;
        iArr[i46] = iModp_set;
        for (int i48 = i41; i48 < i13; i48++) {
            iArr[i46 + i48] = modp_set(bArr[i48], i16);
            iArr[(i47 + i13) - i48] = modp_set(-bArr[i48], i16);
        }
        modp_NTT2(iArr, i46, iArr, i43, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i47, iArr, i43, i11, i16, iModp_ninv31);
        for (int i49 = i42; i49 < i13; i49++) {
            int iModp_montymul3 = modp_montymul(iArr[i47 + i49], iModp_R2, i16, iModp_ninv31);
            iArr[i44 + i49] = modp_montymul(iModp_montymul3, iArr[i49], i16, iModp_ninv31);
            iArr[i45 + i49] = modp_montymul(iModp_montymul3, iArr[i46 + i49], i16, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[i42], i16);
        iArr[i47] = iModp_set2;
        iArr[i46] = iModp_set2;
        for (int i51 = i41; i51 < i13; i51++) {
            iArr[i46 + i51] = modp_set(bArr2[i51], i16);
            iArr[(i47 + i13) - i51] = modp_set(-bArr2[i51], i16);
        }
        modp_NTT2(iArr, i46, iArr, i43, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i47, iArr, i43, i11, i16, iModp_ninv31);
        for (int i52 = i42; i52 < i13; i52++) {
            int iModp_montymul4 = modp_montymul(iArr[i47 + i52], iModp_R2, i16, iModp_ninv31);
            int i53 = i44 + i52;
            iArr[i53] = modp_add(iArr[i53], modp_montymul(iModp_montymul4, iArr[i13 + i52], i16, iModp_ninv31), i16);
            int i54 = i45 + i52;
            iArr[i54] = modp_add(iArr[i54], modp_montymul(iModp_montymul4, iArr[i46 + i52], i16, iModp_ninv31), i16);
        }
        modp_mkgm2(iArr, i43, iArr, i46, i11, FalconSmallPrimeList.PRIMES[i42].f33487g, i16, iModp_ninv31);
        modp_iNTT2(iArr, i44, iArr, i46, i11, i16, iModp_ninv31);
        modp_iNTT2(iArr, i45, iArr, i46, i11, i16, iModp_ninv31);
        int i55 = i45;
        for (int i56 = i42; i56 < i13; i56++) {
            int i57 = i44 + i56;
            iArr[i43 + i56] = modp_norm(iArr[i57], i16);
            iArr[i57] = modp_norm(iArr[i55 + i56], i16);
        }
        double[] dArr = new double[i13 * 3];
        for (int i58 = i42; i58 < i13; i58++) {
            dArr[i43 + i58] = iArr[i44 + i58];
        }
        FalconFFT.FFT(dArr, i43, i11);
        System.arraycopy(dArr, i43, dArr, i13, i14);
        int i59 = i13 + i14;
        int i61 = i42;
        while (i61 < i13) {
            dArr[i59 + i61] = iArr[i43 + i61];
            i61++;
            i55 = i55;
        }
        int i62 = i55;
        FalconFFT.FFT(dArr, i59, i11);
        FalconFFT.poly_div_autoadj_fft(dArr, i59, dArr, i13, i11);
        FalconFFT.iFFT(dArr, i59, i11);
        int i63 = i42;
        while (i63 < i13) {
            iArr[i43 + i63] = modp_set((int) FPREngine.fpr_rint(dArr[i59 + i63]), i16);
            i63++;
            dArr = dArr;
            i59 = i59;
        }
        modp_mkgm2(iArr, i44, iArr, i62, i11, FalconSmallPrimeList.PRIMES[i42].f33487g, i16, iModp_ninv31);
        for (int i64 = i42; i64 < i13; i64++) {
            iArr[i46 + i64] = modp_set(bArr[i64], i16);
            iArr[i47 + i64] = modp_set(bArr2[i64], i16);
        }
        modp_NTT2(iArr, i43, iArr, i44, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i46, iArr, i44, i11, i16, iModp_ninv31);
        modp_NTT2(iArr, i47, iArr, i44, i11, i16, iModp_ninv31);
        for (int i65 = i42; i65 < i13; i65++) {
            int iModp_montymul5 = modp_montymul(iArr[i43 + i65], iModp_R2, i16, iModp_ninv31);
            iArr[i65] = modp_sub(iArr[i65], modp_montymul(iModp_montymul5, iArr[i46 + i65], i16, iModp_ninv31), i16);
            int i66 = i13 + i65;
            iArr[i66] = modp_sub(iArr[i66], modp_montymul(iModp_montymul5, iArr[i47 + i65], i16, iModp_ninv31), i16);
        }
        modp_iNTT2(iArr, 0, iArr, i62, i11, i16, iModp_ninv31);
        modp_iNTT2(iArr, i13, iArr, i62, i11, i16, iModp_ninv31);
        for (int i67 = i42; i67 < i13; i67++) {
            iArr[i67] = modp_norm(iArr[i67], i16);
            int i68 = i13 + i67;
            iArr[i68] = modp_norm(iArr[i68], i16);
        }
        return i41;
    }

    private static int solve_NTRU_binary_depth1(int i11, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i12;
        int i13 = 1;
        int i14 = 1 << i11;
        int i15 = i11 - 1;
        int i16 = 1 << i15;
        int i17 = i16 >> 1;
        int[] iArr2 = MAX_BL_SMALL;
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i21 = MAX_BL_LARGE[1];
        int i22 = i19 * i17;
        int i23 = i22 + i22;
        int i24 = i21 * i16;
        int i25 = i23 + i24;
        int i26 = 0;
        while (i26 < i21) {
            int i27 = FalconSmallPrimeList.PRIMES[i26].f33488p;
            int i28 = i26;
            int iModp_ninv31 = modp_ninv31(i27);
            int iModp_R2 = modp_R2(i27, iModp_ninv31);
            int iModp_Rx = modp_Rx(i19, i27, iModp_ninv31, iModp_R2);
            int i29 = i23 + i28;
            int i31 = i25 + i28;
            int i32 = i25;
            int i33 = i22;
            int i34 = i13;
            int i35 = 0;
            int i36 = 0;
            while (i36 < i17) {
                int i37 = i27;
                int i38 = iModp_R2;
                int i39 = i35;
                iArr[i29] = zint_mod_small_signed(iArr, i35, i19, i37, iModp_ninv31, i38, iModp_Rx);
                int i41 = i33;
                iArr[i31] = zint_mod_small_signed(iArr, i41, i19, i37, iModp_ninv31, i38, iModp_Rx);
                i29 += i21;
                i31 += i21;
                i33 = i41 + i19;
                i35 = i39 + i19;
                i27 = i37;
                iModp_R2 = i38;
                i24 = i24;
                i18 = i18;
                i36++;
                i32 = i32;
            }
            i26 = i28 + 1;
            i24 = i24;
            i18 = i18;
            i13 = i34;
            i25 = i32;
        }
        int i42 = i13;
        int i43 = i18;
        int i44 = 0;
        int i45 = i24;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i23, iArr3, 0, i45);
        System.arraycopy(iArr3, i25, iArr3, i45, i45);
        int i46 = i45 + i45;
        int i47 = i43 * i16;
        int i48 = i46 + i47;
        int i49 = i48 + i47;
        int i51 = 0;
        while (i51 < i21) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i52 = falconSmallPrimeArr[i51].f33488p;
            int iModp_ninv312 = modp_ninv31(i52);
            int iModp_R22 = modp_R2(i52, iModp_ninv312);
            int i53 = i49;
            int i54 = i53 + i14;
            int i55 = i54 + i16;
            int i56 = i55 + i14;
            int i57 = i51;
            modp_mkgm2(iArr3, i53, iArr, i54, i11, falconSmallPrimeArr[i51].f33487g, i52, iModp_ninv312);
            int i58 = i52;
            for (int i59 = i44; i59 < i14; i59++) {
                iArr[i55 + i59] = modp_set(bArr[i59], i58);
                iArr[i56 + i59] = modp_set(bArr2[i59], i58);
            }
            modp_NTT2(iArr, i55, iArr, i53, i11, i58, iModp_ninv312);
            modp_NTT2(iArr, i56, iArr, i53, i11, i58, iModp_ninv312);
            int i61 = i11;
            while (i61 > i15) {
                int i62 = i58;
                int i63 = iModp_R22;
                int i64 = i55;
                modp_poly_rec_res(iArr, i64, i61, i62, iModp_ninv312, i63);
                int i65 = i56;
                modp_poly_rec_res(iArr, i65, i61, i62, iModp_ninv312, i63);
                i58 = i62;
                iModp_R22 = i63;
                i56 = i65;
                i61--;
                i55 = i64;
            }
            int i66 = iModp_R22;
            int i67 = i53 + i16;
            System.arraycopy(iArr, i54, iArr, i67, i16);
            int i68 = i67 + i16;
            System.arraycopy(iArr, i55, iArr, i68, i16);
            int i69 = i68 + i16;
            System.arraycopy(iArr, i56, iArr, i69, i16);
            int i71 = i69 + i16;
            int i72 = i71 + i17;
            int i73 = i45 + i57;
            int i74 = i73;
            int i75 = i57;
            int i76 = 0;
            while (i76 < i17) {
                iArr[i71 + i76] = iArr[i75];
                iArr[i72 + i76] = iArr[i74];
                i76++;
                i75 += i21;
                i74 += i21;
            }
            int i77 = i11 - 2;
            modp_NTT2(iArr, i71, iArr, i53, i77, i58, iModp_ninv312);
            int i78 = i72;
            modp_NTT2(iArr, i78, iArr, i53, i77, i58, iModp_ninv312);
            int i79 = i73;
            int i81 = i57;
            int i82 = 0;
            while (i82 < i17) {
                int i83 = i82 << 1;
                int i84 = i68 + i83;
                int i85 = i81;
                int i86 = iArr[i84];
                int i87 = i78;
                int i88 = iArr[i84 + 1];
                int i89 = i83 + i69;
                int i91 = i79;
                int i92 = iArr[i89];
                int i93 = iArr[i89 + 1];
                int i94 = i82;
                int iModp_montymul = modp_montymul(iArr[i71 + i82], i66, i58, iModp_ninv312);
                int i95 = i69;
                int iModp_montymul2 = modp_montymul(iArr[i87 + i94], i66, i58, iModp_ninv312);
                iArr[i85] = modp_montymul(i93, iModp_montymul, i58, iModp_ninv312);
                iArr[i85 + i21] = modp_montymul(i92, iModp_montymul, i58, iModp_ninv312);
                iArr[i91] = modp_montymul(i88, iModp_montymul2, i58, iModp_ninv312);
                iArr[i91 + i21] = modp_montymul(i86, iModp_montymul2, i58, iModp_ninv312);
                i82 = i94 + 1;
                int i96 = i21 << 1;
                i79 = i91 + i96;
                i81 = i85 + i96;
                i78 = i87;
                i69 = i95;
            }
            int i97 = i69;
            int i98 = i21;
            int i99 = i58;
            int i100 = i15;
            modp_iNTT2_ext(iArr, i57, i98, iArr, i67, i100, i99, iModp_ninv312);
            modp_iNTT2_ext(iArr, i73, i98, iArr, i67, i100, i99, iModp_ninv312);
            int i101 = i43;
            if (i57 < i101) {
                modp_iNTT2(iArr, i68, iArr, i67, i100, i99, iModp_ninv312);
                modp_iNTT2(iArr, i97, iArr, i67, i100, i99, iModp_ninv312);
                i12 = i100;
                int i102 = i46 + i57;
                int i103 = i48 + i57;
                int i104 = 0;
                while (i104 < i16) {
                    iArr[i102] = iArr[i68 + i104];
                    iArr[i103] = iArr[i97 + i104];
                    i104++;
                    i102 += i101;
                    i103 += i101;
                }
            } else {
                i12 = i100;
            }
            i51 = i57 + 1;
            iArr3 = iArr;
            i43 = i101;
            i15 = i12;
            i49 = i53;
            i44 = 0;
            i21 = i98;
        }
        int i105 = i49;
        int i106 = i21;
        int i107 = i15;
        int i108 = i43;
        int i109 = i16 << 1;
        zint_rebuild_CRT(iArr, 0, i106, i106, i109, 1, iArr, i105);
        zint_rebuild_CRT(iArr, i46, i108, i108, i109, 1, iArr, i105);
        double[] dArr = new double[i16];
        double[] dArr2 = new double[i16];
        poly_big_to_fp(dArr, iArr, 0, i106, i106, i107);
        poly_big_to_fp(dArr2, iArr, i45, i106, i106, i107);
        System.arraycopy(iArr, i46, iArr, 0, i108 * 2 * i16);
        double[] dArr3 = new double[i16];
        double[] dArr4 = new double[i16];
        poly_big_to_fp(dArr3, iArr, 0, i108, i108, i107);
        poly_big_to_fp(dArr4, iArr, i47, i108, i108, i107);
        FalconFFT.FFT(dArr, 0, i107);
        FalconFFT.FFT(dArr2, 0, i107);
        FalconFFT.FFT(dArr3, 0, i107);
        FalconFFT.FFT(dArr4, 0, i107);
        double[] dArr5 = new double[i16];
        double[] dArr6 = new double[i17];
        FalconFFT.poly_add_muladj_fft(dArr5, dArr, dArr2, dArr3, dArr4, i107);
        FalconFFT.poly_invnorm2_fft(dArr6, 0, dArr3, 0, dArr4, 0, i107);
        FalconFFT.poly_mul_autoadj_fft(dArr5, 0, dArr6, 0, i107);
        FalconFFT.iFFT(dArr5, 0, i107);
        for (int i110 = 0; i110 < i16; i110++) {
            double d3 = dArr5[i110];
            if (d3 >= 9.223372036854776E18d || -9.223372036854776E18d >= d3) {
                return 0;
            }
            dArr5[i110] = FPREngine.fpr_rint(d3);
        }
        FalconFFT.FFT(dArr5, 0, i107);
        FalconFFT.poly_mul_fft(dArr3, 0, dArr5, 0, i107);
        FalconFFT.poly_mul_fft(dArr4, 0, dArr5, 0, i107);
        FalconFFT.poly_sub(dArr, 0, dArr3, 0, i107);
        FalconFFT.poly_sub(dArr2, 0, dArr4, 0, i107);
        FalconFFT.iFFT(dArr, 0, i107);
        FalconFFT.iFFT(dArr2, 0, i107);
        for (int i111 = 0; i111 < i16; i111++) {
            iArr[i111] = (int) FPREngine.fpr_rint(dArr[i111]);
            iArr[i16 + i111] = (int) FPREngine.fpr_rint(dArr2[i111]);
        }
        return i42;
    }

    private static int solve_NTRU_deepest(int i11, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i12 = MAX_BL_SMALL[i11];
        int i13 = i12 + i12;
        int i14 = i13 + i12;
        int i15 = i14 + i12;
        make_fg(iArr, i13, bArr, bArr2, i11, i11, 0);
        zint_rebuild_CRT(iArr, i13, i12, i12, 2, 0, iArr, i15);
        return (zint_bezout(iArr, i12, iArr, 0, iArr, i13, iArr, i14, i12, iArr, i15) != 0 && zint_mul_small(iArr, 0, i12, 12289) == 0 && zint_mul_small(iArr, i12, i12, 12289) == 0) ? 1 : 0;
    }

    private static int solve_NTRU_intermediate(int i11, byte[] bArr, byte[] bArr2, int i12, int[] iArr) {
        double d3;
        double[] dArr;
        int i13;
        double[] dArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        double[] dArr3;
        int i18;
        double[] dArr4;
        int i19;
        double[] dArr5;
        int[] iArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39 = i11 - i12;
        int i41 = 1;
        int i42 = 1 << i39;
        int i43 = i42 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i44 = iArr3[i12];
        int i45 = iArr3[i12 + 1];
        int i46 = MAX_BL_LARGE[i12];
        int i47 = i45 * i43;
        int i48 = i47 + i47;
        int[] iArr4 = iArr;
        make_fg(iArr4, i48, bArr, bArr2, i11, i12, 1);
        int i49 = i12;
        int i51 = i42 * i46;
        int i52 = i51 + i51;
        int i53 = i42 * i44;
        System.arraycopy(iArr4, i48, iArr4, i52, i53 + i53);
        int i54 = i52 + i53;
        int i55 = i54 + i53;
        int i56 = 0;
        System.arraycopy(iArr4, 0, iArr4, i55, i47 + i47);
        int i57 = i47 + i55;
        int i58 = 0;
        while (i58 < i46) {
            int i59 = FalconSmallPrimeList.PRIMES[i58].f33488p;
            int iModp_ninv31 = modp_ninv31(i59);
            int i61 = i41;
            int iModp_R2 = modp_R2(i59, iModp_ninv31);
            int iModp_Rx = modp_Rx(i45, i59, iModp_ninv31, iModp_R2);
            int i62 = i51 + i58;
            int i63 = i55;
            int i64 = i58;
            int i65 = i42;
            int i66 = i57;
            int i67 = 0;
            while (i67 < i43) {
                int i68 = i45;
                int i69 = i58;
                int i71 = i59;
                int i72 = iModp_R2;
                int i73 = i55;
                iArr[i64] = zint_mod_small_signed(iArr4, i55, i68, i71, iModp_ninv31, i72, iModp_Rx);
                int i74 = i66;
                iArr[i62] = zint_mod_small_signed(iArr, i74, i68, i71, iModp_ninv31, i72, iModp_Rx);
                i67++;
                i66 = i74 + i68;
                i64 += i46;
                i62 += i46;
                i45 = i68;
                i52 = i52;
                i55 = i73 + i68;
                iModp_R2 = i72;
                iArr4 = iArr;
                i59 = i71;
                i58 = i69;
            }
            i58++;
            i45 = i45;
            i52 = i52;
            iArr4 = iArr;
            i56 = 0;
            i41 = i61;
            i42 = i65;
            i55 = i63;
        }
        int i75 = i55;
        int i76 = i52;
        int i77 = i42;
        int i78 = i41;
        int i79 = i56;
        while (i79 < i46) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i81 = falconSmallPrimeArr[i79].f33488p;
            int iModp_ninv312 = modp_ninv31(i81);
            int iModp_R22 = modp_R2(i81, iModp_ninv312);
            if (i79 == i44) {
                int i82 = i44;
                int i83 = i76;
                i31 = iModp_ninv312;
                i24 = iModp_R22;
                i25 = i44;
                i26 = i77;
                int i84 = i75;
                i28 = i81;
                zint_rebuild_CRT(iArr, i83, i25, i82, i26, 1, iArr, i84);
                i29 = i83;
                zint_rebuild_CRT(iArr, i54, i25, i25, i26, 1, iArr, i84);
                i27 = i84;
            } else {
                i24 = iModp_R22;
                i25 = i44;
                i26 = i77;
                i27 = i75;
                i28 = i81;
                i29 = i76;
                i31 = iModp_ninv312;
            }
            int i85 = i27 + i26;
            int i86 = i85 + i26;
            int i87 = i86 + i26;
            int i88 = i25;
            int i89 = i27;
            int i91 = i31;
            int i92 = i28;
            int i93 = i26;
            int i94 = i39;
            modp_mkgm2(iArr, i89, iArr, i85, i94, falconSmallPrimeArr[i79].f33487g, i92, i91);
            if (i79 < i88) {
                int i95 = i29 + i79;
                int i96 = i54 + i79;
                int i97 = i95;
                int i98 = i96;
                int i99 = 0;
                while (i99 < i93) {
                    iArr[i86 + i99] = iArr[i97];
                    iArr[i87 + i99] = iArr[i98];
                    i99++;
                    i97 += i88;
                    i98 += i88;
                }
                modp_iNTT2_ext(iArr, i95, i88, iArr, i85, i94, i92, i91);
                modp_iNTT2_ext(iArr, i96, i88, iArr, i85, i94, i92, i91);
                i32 = i85;
                i38 = i91;
                i33 = i89;
                i35 = i86;
                i36 = i87;
                i34 = i88;
                i37 = i94;
            } else {
                i32 = i85;
                int i100 = i92;
                int iModp_Rx2 = modp_Rx(i88, i100, i91, i24);
                int i101 = i54;
                int i102 = i29;
                int i103 = 0;
                while (i103 < i93) {
                    int i104 = i100;
                    int i105 = i24;
                    int i106 = i103;
                    int i107 = i102;
                    int i108 = iModp_Rx2;
                    iArr[i86 + i103] = zint_mod_small_signed(iArr, i102, i88, i104, i91, i105, iModp_Rx2);
                    int i109 = i101;
                    iArr[i87 + i106] = zint_mod_small_signed(iArr, i109, i88, i104, i91, i105, i108);
                    int i110 = i106 + 1;
                    i101 = i109 + i88;
                    i102 = i107 + i88;
                    i24 = i105;
                    i100 = i104;
                    iModp_Rx2 = i108;
                    i103 = i110;
                }
                int i111 = i100;
                i33 = i89;
                i34 = i88;
                modp_NTT2(iArr, i86, iArr, i33, i94, i111, i91);
                i35 = i86;
                modp_NTT2(iArr, i87, iArr, i33, i94, i111, i91);
                i36 = i87;
                i37 = i94;
                i38 = i91;
                i92 = i111;
            }
            int i112 = i36 + i93;
            int i113 = i112 + i43;
            int i114 = i51 + i79;
            int i115 = i79;
            int i116 = i114;
            int i117 = 0;
            while (i117 < i43) {
                iArr[i112 + i117] = iArr[i115];
                iArr[i113 + i117] = iArr[i116];
                i117++;
                i115 += i46;
                i116 += i46;
            }
            int i118 = i92;
            int i119 = i38;
            int i120 = i37 - 1;
            modp_NTT2(iArr, i112, iArr, i33, i120, i118, i119);
            int i121 = i113;
            modp_NTT2(iArr, i121, iArr, i33, i120, i118, i119);
            i75 = i33;
            int i122 = i79;
            int i123 = i114;
            int i124 = 0;
            while (i124 < i43) {
                int i125 = i124 << 1;
                int i126 = i35 + i125;
                int i127 = i124;
                int i128 = iArr[i126];
                int i129 = i121;
                int i130 = iArr[i126 + 1];
                int i131 = i36 + i125;
                int i132 = i122;
                int i133 = iArr[i131];
                int i134 = iArr[i131 + 1];
                int i135 = i123;
                int iModp_montymul = modp_montymul(iArr[i112 + i127], i24, i118, i119);
                int i136 = i37;
                int iModp_montymul2 = modp_montymul(iArr[i129 + i127], i24, i118, i119);
                iArr[i132] = modp_montymul(i134, iModp_montymul, i118, i119);
                iArr[i132 + i46] = modp_montymul(i133, iModp_montymul, i118, i119);
                iArr[i135] = modp_montymul(i130, iModp_montymul2, i118, i119);
                iArr[i135 + i46] = modp_montymul(i128, iModp_montymul2, i118, i119);
                i124 = i127 + 1;
                int i137 = i46 << 1;
                i122 = i132 + i137;
                i123 = i135 + i137;
                i121 = i129;
                i37 = i136;
            }
            int i138 = i37;
            int i139 = i32;
            int i140 = i79;
            modp_iNTT2_ext(iArr, i140, i46, iArr, i139, i138, i118, i119);
            modp_iNTT2_ext(iArr, i114, i46, iArr, i139, i138, i118, i119);
            i79 = i140 + 1;
            i76 = i29;
            i77 = i93;
            i44 = i34;
            i39 = i138;
        }
        int i141 = i39;
        int i142 = i44;
        int i143 = i77;
        int i144 = i76;
        int i145 = i75;
        zint_rebuild_CRT(iArr, 0, i46, i46, i143, 1, iArr, i145);
        zint_rebuild_CRT(iArr, i51, i46, i46, i143, 1, iArr, i145);
        double[] dArr6 = new double[i143];
        double[] dArr7 = new double[i143];
        double[] dArr8 = new double[i143];
        double[] dArr9 = new double[i143];
        double[] dArr10 = new double[i43];
        int[] iArr5 = new int[i143];
        int iMin = Math.min(i142, 10);
        int i146 = (i144 + i142) - iMin;
        int i147 = 10;
        poly_big_to_fp(dArr8, iArr, i146, iMin, i142, i141);
        poly_big_to_fp(dArr9, iArr, (i54 + i142) - iMin, iMin, i142, i141);
        int i148 = i142;
        int i149 = (i148 - iMin) * 31;
        int i150 = bitlength_avg[i49];
        int i151 = bitlength_std[i49];
        int i152 = i150 - (i151 * 6);
        int i153 = (i151 * 6) + i150;
        FalconFFT.FFT(dArr8, 0, i141);
        FalconFFT.FFT(dArr9, 0, i141);
        FalconFFT.poly_invnorm2_fft(dArr10, 0, dArr8, 0, dArr9, 0, i141);
        double[] dArr11 = dArr9;
        int i154 = i141;
        double[] dArr12 = dArr8;
        FalconFFT.poly_adj_fft(dArr12, 0, i154);
        FalconFFT.poly_adj_fft(dArr11, 0, i154);
        int i155 = i46 * 31;
        int i156 = i155;
        int i157 = i155 - i152;
        int i158 = i46;
        while (true) {
            int iMin2 = Math.min(i158, i147);
            double[] dArr13 = dArr6;
            double[] dArr14 = dArr11;
            int i159 = i46;
            double[] dArr15 = dArr10;
            int i160 = i158;
            poly_big_to_fp(dArr13, iArr, i158 - iMin2, iMin2, i159, i154);
            double[] dArr16 = dArr7;
            poly_big_to_fp(dArr16, iArr, (i51 + i160) - iMin2, iMin2, i159, i154);
            FalconFFT.FFT(dArr13, 0, i154);
            FalconFFT.FFT(dArr16, 0, i154);
            FalconFFT.poly_mul_fft(dArr13, 0, dArr12, 0, i154);
            FalconFFT.poly_mul_fft(dArr16, 0, dArr14, 0, i154);
            FalconFFT.poly_add(dArr16, 0, dArr13, 0, i154);
            FalconFFT.poly_mul_autoadj_fft(dArr16, 0, dArr15, 0, i154);
            FalconFFT.iFFT(dArr16, 0, i154);
            int i161 = (i157 - ((i158 - iMin2) * 31)) + i149;
            if (i161 < 0) {
                i161 = -i161;
                d3 = 2.0d;
            } else {
                d3 = 0.5d;
            }
            double d11 = 1.0d;
            while (i161 != 0) {
                if ((i161 & 1) != 0) {
                    d11 *= d3;
                }
                i161 >>= 1;
                d3 *= d3;
            }
            int i162 = 0;
            while (i162 < i143) {
                double d12 = dArr16[i162] * d11;
                if (-2.147483647E9d >= d12 || d12 >= 2.147483647E9d) {
                    return 0;
                }
                iArr5[i162] = (int) FPREngine.fpr_rint(d12);
                i162++;
                dArr15 = dArr15;
            }
            double[] dArr17 = dArr15;
            int i163 = i156;
            int i164 = i157 / 31;
            int i165 = i157 % 31;
            if (i49 <= 4) {
                dArr2 = dArr13;
                i19 = i145;
                int i166 = i148;
                i22 = i154;
                int i167 = i144;
                dArr4 = dArr12;
                i21 = i148;
                dArr5 = dArr14;
                i13 = i163;
                i16 = 10;
                dArr = dArr17;
                i18 = i159;
                dArr3 = dArr16;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, 0, i160, i18, iArr, i167, i21, i166, iArr5, i164, i165, i22, iArr, i19);
                i17 = 0;
                i15 = i167;
                i23 = i51;
                poly_sub_scaled_ntt(iArr2, i23, i160, i18, iArr, i54, i21, i21, iArr5, i164, i165, i22, iArr, i19);
                i14 = i160;
            } else {
                dArr = dArr17;
                i13 = i163;
                dArr2 = dArr13;
                i14 = i160;
                i15 = i144;
                i16 = 10;
                i17 = 0;
                dArr3 = dArr16;
                i18 = i159;
                dArr4 = dArr12;
                i19 = i145;
                int i168 = i148;
                dArr5 = dArr14;
                iArr2 = iArr;
                i21 = i168;
                i22 = i154;
                poly_sub_scaled(iArr2, 0, i14, i18, iArr, i15, i21, i168, iArr5, i164, i165, i22);
                i23 = i51;
                poly_sub_scaled(iArr2, i23, i14, i18, iArr, i54, i21, i21, iArr5, i164, i165, i22);
            }
            int i169 = i21;
            i154 = i22;
            int i170 = i157 + i153;
            int i171 = i170 + 10;
            if (i171 < i13) {
                if (i14 * 31 >= i170 + 41) {
                    i14--;
                }
                i156 = i171;
            } else {
                i156 = i13;
            }
            if (i157 <= 0) {
                if (i14 < i169) {
                    int i172 = i23;
                    int i173 = 0;
                    int i174 = i17;
                    while (i173 < i143) {
                        int i175 = (-(iArr2[(i174 + i14) - 1] >>> 30)) >>> 1;
                        for (int i176 = i14; i176 < i169; i176++) {
                            iArr2[i174 + i176] = i175;
                        }
                        int i177 = (-(iArr2[(i172 + i14) - 1] >>> 30)) >>> 1;
                        for (int i178 = i14; i178 < i169; i178++) {
                            iArr2[i172 + i178] = i177;
                        }
                        i173++;
                        i174 += i18;
                        i172 += i18;
                    }
                }
                int i179 = 0;
                int i180 = 0;
                int i181 = 0;
                while (i180 < (i143 << 1)) {
                    System.arraycopy(iArr2, i179, iArr2, i181, i169);
                    i180++;
                    i181 += i169;
                    i179 += i18;
                }
                return i78;
            }
            int i182 = i157 - 25;
            i157 = i182 < 0 ? 0 : i182;
            i49 = i12;
            i51 = i23;
            i158 = i14;
            i145 = i19;
            dArr7 = dArr3;
            dArr12 = dArr4;
            dArr11 = dArr5;
            dArr6 = dArr2;
            dArr10 = dArr;
            i147 = i16;
            i144 = i15;
            i148 = i169;
            i46 = i18;
        }
    }

    private static long toUnsignedLong(int i11) {
        return ((long) i11) & 4294967295L;
    }

    private static void zint_add_mul_small(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i11 + i16;
            long unsignedLong = (toUnsignedLong(iArr2[i12 + i16]) * toUnsignedLong(i14)) + toUnsignedLong(iArr[i17]) + toUnsignedLong(i15);
            iArr[i17] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i15 = (int) (unsignedLong >>> 31);
        }
        iArr[i11 + i13] = i15;
    }

    private static void zint_add_scaled_mul_small(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16, int i17) {
        if (i14 == 0) {
            return;
        }
        int i18 = (-(iArr2[(i13 + i14) - 1] >>> 30)) >>> 1;
        int i19 = 0;
        int i21 = i16;
        int i22 = 0;
        while (i21 < i12) {
            int i23 = i21 - i16;
            int i24 = i23 < i14 ? iArr2[i13 + i23] : i18;
            int i25 = i11 + i21;
            long unsignedLong = (toUnsignedLong(i19 | ((i24 << i17) & Integer.MAX_VALUE)) * ((long) i15)) + toUnsignedLong(iArr[i25]) + ((long) i22);
            iArr[i25] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i22 = (int) (unsignedLong >>> 31);
            i21++;
            i19 = i24 >>> (31 - i17);
        }
    }

    private static int zint_bezout(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13, int[] iArr4, int i14, int i15, int[] iArr5, int i16) {
        int[] iArr6 = iArr3;
        int i17 = i13;
        int[] iArr7 = iArr4;
        int i18 = i14;
        int i19 = i15;
        int[] iArr8 = iArr5;
        int i21 = i16;
        if (i19 == 0) {
            return 0;
        }
        int i22 = i21 + i19;
        int i23 = i22 + i19;
        int i24 = i23 + i19;
        int iModp_ninv31 = modp_ninv31(iArr6[i17]);
        int iModp_ninv312 = modp_ninv31(iArr7[i18]);
        System.arraycopy(iArr6, i17, iArr8, i23, i19);
        System.arraycopy(iArr7, i18, iArr8, i24, i19);
        iArr[i11] = 1;
        iArr2[i12] = 0;
        for (int i25 = 1; i25 < i19; i25++) {
            iArr[i11 + i25] = 0;
            iArr2[i12 + i25] = 0;
        }
        System.arraycopy(iArr7, i18, iArr8, i21, i19);
        System.arraycopy(iArr6, i17, iArr8, i22, i19);
        iArr8[i22] = iArr8[i22] - 1;
        int i26 = 30;
        int i27 = (i19 * 62) + 30;
        while (true) {
            int i28 = 31;
            if (i27 < i26) {
                break;
            }
            int i29 = -1;
            int i31 = i19;
            int i32 = -1;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            while (true) {
                int i37 = i31 - 1;
                if (i31 <= 0) {
                    break;
                }
                int i38 = iArr8[i23 + i37];
                int i39 = iArr8[i24 + i37];
                i34 ^= (i34 ^ i38) & i32;
                i33 ^= (i33 ^ i38) & i29;
                i36 ^= (i36 ^ i39) & i32;
                i35 ^= (i35 ^ i39) & i29;
                int i41 = i32 & ((((i38 | i39) + Integer.MAX_VALUE) >>> 31) - 1);
                int i42 = i32;
                i32 = i41;
                i29 = i42;
                i31 = i37;
            }
            int i43 = ~i29;
            long unsignedLong = (toUnsignedLong(i34 & i43) << 31) + toUnsignedLong(i33 | (i34 & i29));
            long unsignedLong2 = (toUnsignedLong(i36 & i43) << 31) + toUnsignedLong(i35 | (i36 & i29));
            int i44 = iArr8[i23];
            int i45 = iArr8[i24];
            long j9 = 0;
            long j11 = 1;
            int i46 = iModp_ninv31;
            long j12 = 0;
            long j13 = 1;
            int i47 = 0;
            while (i47 < i28) {
                long j14 = unsignedLong2 - unsignedLong;
                int i48 = i28;
                int i49 = i23;
                int i51 = (int) ((j14 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j14))) >>> 63);
                int i52 = (i44 >> i47) & 1;
                int i53 = i52 & (i45 >> i47) & 1;
                int i54 = i47;
                int i55 = i53 & i51;
                int i56 = i53 & (~i51);
                int i57 = (i52 ^ 1) | i55;
                int i58 = i44 - ((-i55) & i45);
                long j15 = unsignedLong - (unsignedLong2 & (-toUnsignedLong(i55)));
                long j16 = -i55;
                long j17 = j13 - (j12 & j16);
                long j18 = j9 - (j11 & j16);
                int i59 = i45 - ((-i56) & i58);
                long j19 = unsignedLong2 - (j15 & (-toUnsignedLong(i56)));
                long j21 = -i56;
                long j22 = j12 - (j17 & j21);
                long j23 = j11 - (j18 & j21);
                i44 = i58 + ((i57 - 1) & i58);
                long j24 = i57;
                long j25 = j24 - 1;
                j13 = j17 + (j17 & j25);
                j9 = j18 + (j18 & j25);
                unsignedLong = j15 ^ ((j15 ^ (j15 >> 1)) & (-toUnsignedLong(i57)));
                i45 = i59 + ((-i57) & i59);
                long j26 = -j24;
                j12 = j22 + (j22 & j26);
                j11 = j23 + (j23 & j26);
                unsignedLong2 = j19 ^ ((j19 ^ (j19 >> 1)) & (toUnsignedLong(i57) - 1));
                i47 = i54 + 1;
                iModp_ninv312 = iModp_ninv312;
                i23 = i49;
                i28 = i48;
                i27 = i27;
                i22 = i22;
            }
            int i61 = iModp_ninv312;
            long j27 = j9;
            long j28 = j13;
            int iZint_co_reduce = zint_co_reduce(iArr8, i23, iArr5, i24, i19, j28, j27, j12, j11);
            long j29 = -(iZint_co_reduce & 1);
            long j31 = j28 - ((j28 + j28) & j29);
            long j32 = j27 - (j29 & (j27 + j27));
            long j33 = -(iZint_co_reduce >>> 1);
            long j34 = j12 - ((j12 + j12) & j33);
            long j35 = j11 - ((j11 + j11) & j33);
            zint_co_reduce_mod(iArr, i11, iArr5, i21, iArr7, i18, i15, i61, j31, j32, j34, j35);
            i19 = i15;
            zint_co_reduce_mod(iArr2, i12, iArr5, i22, iArr6, i17, i19, i46, j31, j32, j34, j35);
            i27 -= 30;
            iArr6 = iArr3;
            i17 = i13;
            iArr7 = iArr4;
            i18 = i14;
            iArr8 = iArr5;
            i21 = i16;
            iModp_ninv31 = i46;
            i24 = i24;
            i26 = 30;
            iModp_ninv312 = i61;
            i23 = i23;
        }
        int i62 = i23;
        int i63 = iArr5[i62] ^ 1;
        for (int i64 = 1; i64 < i19; i64++) {
            i63 |= iArr5[i62 + i64];
        }
        return (1 - ((i63 | (-i63)) >>> 31)) & iArr3[i13] & iArr4[i14];
    }

    private static int zint_co_reduce(int[] iArr, int i11, int[] iArr2, int i12, int i13, long j9, long j11, long j12, long j13) {
        long j14 = 0;
        int i14 = 0;
        long j15 = 0;
        while (i14 < i13) {
            int i15 = i11 + i14;
            int i16 = i12 + i14;
            long j16 = iArr[i15];
            long j17 = iArr2[i16];
            long jC = s.c(j17, j11, j16 * j9, j15);
            int i17 = i14;
            long jC2 = s.c(j17, j13, j16 * j12, j14);
            if (i17 > 0) {
                iArr[i15 - 1] = ((int) jC) & Integer.MAX_VALUE;
                iArr2[i16 - 1] = ((int) jC2) & Integer.MAX_VALUE;
            }
            j14 = jC2 >> 31;
            i14 = i17 + 1;
            j15 = jC >> 31;
        }
        long j18 = j14;
        iArr[(i11 + i13) - 1] = (int) j15;
        iArr2[(i12 + i13) - 1] = (int) j18;
        int i18 = (int) (j15 >>> 63);
        int i19 = (int) (j18 >>> 63);
        zint_negate(iArr, i11, i13, i18);
        zint_negate(iArr2, i12, i13, i19);
        return (i19 << 1) | i18;
    }

    private static void zint_co_reduce_mod(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13, int i14, int i15, long j9, long j11, long j12, long j13) {
        int i16 = i14;
        long j14 = j9;
        int i17 = iArr[i11];
        int i18 = iArr2[i12];
        int i19 = Integer.MAX_VALUE;
        int i21 = (((((int) j11) * i18) + (((int) j14) * i17)) * i15) & Integer.MAX_VALUE;
        int i22 = (((i18 * ((int) j13)) + (i17 * ((int) j12))) * i15) & Integer.MAX_VALUE;
        int i23 = 0;
        long j15 = 0;
        long j16 = 0;
        while (i23 < i16) {
            int i24 = i11 + i23;
            int i25 = i12 + i23;
            int i26 = i19;
            int i27 = i23;
            long j17 = iArr[i24];
            long j18 = iArr2[i25];
            int i28 = i13 + i27;
            long jC = s.c(iArr3[i28], toUnsignedLong(i21), (j18 * j11) + (j17 * j14), j15);
            long jC2 = s.c(iArr3[i28], toUnsignedLong(i22), (j18 * j13) + (j17 * j12), j16);
            if (i27 > 0) {
                iArr[i24 - 1] = ((int) jC) & i26;
                iArr2[i25 - 1] = ((int) jC2) & i26;
            }
            j15 = jC >> 31;
            j16 = jC2 >> 31;
            i23 = i27 + 1;
            i16 = i14;
            j14 = j9;
            i19 = i26;
        }
        long j19 = j15;
        long j21 = j16;
        iArr[(i11 + i14) - 1] = (int) j19;
        iArr2[(i12 + i14) - 1] = (int) j21;
        zint_finish_mod(iArr, i11, i14, iArr3, i13, (int) (j19 >>> 63));
        zint_finish_mod(iArr2, i12, i14, iArr3, i13, (int) (j21 >>> 63));
    }

    private static void zint_finish_mod(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            i15 = ((iArr[i11 + i16] - iArr2[i13 + i16]) - i15) >>> 31;
        }
        int i17 = (-i14) >>> 1;
        int i18 = -((1 - i15) | i14);
        for (int i19 = 0; i19 < i12; i19++) {
            int i21 = i11 + i19;
            int i22 = (iArr[i21] - ((iArr2[i13 + i19] ^ i17) & i18)) - i14;
            iArr[i21] = Integer.MAX_VALUE & i22;
            i14 = i22 >>> 31;
        }
    }

    private static int zint_mod_small_signed(int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i12 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i11, i12, i13, i14, i15), (-(iArr[(i11 + i12) - 1] >>> 30)) & i16, i13);
    }

    private static int zint_mod_small_unsigned(int[] iArr, int i11, int i12, int i13, int i14, int i15) {
        int iModp_add = 0;
        while (true) {
            int i16 = i12 - 1;
            if (i12 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i15, i13, i14);
            int i17 = iArr[i11 + i16] - i13;
            iModp_add = modp_add(iModp_montymul, i17 + ((-(i17 >>> 31)) & i13), i13);
            i12 = i16;
        }
    }

    private static int zint_mul_small(int[] iArr, int i11, int i12, int i13) {
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i11 + i15;
            long unsignedLong = (toUnsignedLong(iArr[i16]) * toUnsignedLong(i13)) + ((long) i14);
            iArr[i16] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i14 = (int) (unsignedLong >> 31);
        }
        return i14;
    }

    private static void zint_negate(int[] iArr, int i11, int i12, int i13) {
        int i14 = (-i13) >>> 1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i11 + i15;
            int i17 = (iArr[i16] ^ i14) + i13;
            iArr[i16] = Integer.MAX_VALUE & i17;
            i13 = i17 >>> 31;
        }
    }

    private static void zint_norm_zero(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        int i14 = 0;
        int i15 = i13;
        int i16 = 0;
        while (true) {
            int i17 = i15 - 1;
            if (i15 <= 0) {
                zint_sub(iArr, i11, iArr2, i12, i13, i14 >>> 31);
                return;
            }
            int i18 = iArr[i11 + i17];
            int i19 = iArr2[i12 + i17];
            int i21 = ((i16 << 30) | (i19 >>> 1)) - i18;
            i14 |= ((-(i21 >>> 31)) | ((-i21) >>> 31)) & ((i14 & 1) - 1);
            i15 = i17;
            i16 = i19 & 1;
        }
    }

    private static int zint_one_to_plain(int[] iArr, int i11) {
        int i12 = iArr[i11];
        return i12 | ((1073741824 & i12) << 1);
    }

    private static void zint_rebuild_CRT(int[] iArr, int i11, int i12, int i13, int i14, int i15, int[] iArr2, int i16) {
        int i17 = 0;
        iArr2[i16] = FalconSmallPrimeList.PRIMES[0].f33488p;
        int i18 = 1;
        while (i18 < i12) {
            FalconSmallPrime falconSmallPrime = FalconSmallPrimeList.PRIMES[i18];
            int i19 = falconSmallPrime.f33488p;
            int i21 = falconSmallPrime.f33489s;
            int iModp_ninv31 = modp_ninv31(i19);
            int iModp_R2 = modp_R2(i19, iModp_ninv31);
            int i22 = i11;
            int i23 = 0;
            while (i23 < i14) {
                int i24 = i19;
                int i25 = iModp_ninv31;
                int i26 = iModp_R2;
                int iModp_montymul = modp_montymul(i21, modp_sub(iArr[i22 + i18], zint_mod_small_unsigned(iArr, i22, i18, i19, iModp_ninv31, iModp_R2), i24), i24, i25);
                int i27 = i18;
                zint_add_mul_small(iArr, i22, iArr2, i16, i27, iModp_montymul);
                i23++;
                i22 += i13;
                i18 = i27;
                i19 = i24;
                iModp_ninv31 = i25;
                iModp_R2 = i26;
            }
            int i28 = i18;
            iArr2[i16 + i28] = zint_mul_small(iArr2, i16, i28, i19);
            i18 = i28 + 1;
        }
        if (i15 != 0) {
            int i29 = i11;
            while (i17 < i14) {
                zint_norm_zero(iArr, i29, iArr2, i16, i12);
                i17++;
                i29 += i13;
            }
        }
    }

    private static void zint_sub(int[] iArr, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15 = -i14;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = i11 + i17;
            int i19 = iArr[i18];
            int i21 = (i19 - iArr2[i12 + i17]) - i16;
            i16 = i21 >>> 31;
            iArr[i18] = i19 ^ (((i21 & Integer.MAX_VALUE) ^ i19) & i15);
        }
    }

    private static void zint_sub_scaled(int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15, int i16) {
        if (i14 == 0) {
            return;
        }
        int i17 = (-(iArr2[(i13 + i14) - 1] >>> 30)) >>> 1;
        int i18 = 0;
        int i19 = i15;
        int i21 = 0;
        while (i19 < i12) {
            int i22 = i19 - i15;
            int i23 = i22 < i14 ? iArr2[i22 + i13] : i17;
            int i24 = i11 + i19;
            int i25 = (iArr[i24] - (i18 | ((i23 << i16) & Integer.MAX_VALUE))) - i21;
            iArr[i24] = i25 & Integer.MAX_VALUE;
            i21 = i25 >>> 31;
            i19++;
            i18 = i23 >>> (31 - i16);
        }
    }
}
