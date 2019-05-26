package com.example.fahad.pharmacy.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.fahad.pharmacy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddMedicineFragment extends Fragment implements View.OnClickListener {
    EditText edt_name;
    EditText edt_generic_name;
    EditText edt_form_type;
    EditText edt_purchase_price;
    EditText edt_sales_price;
    EditText edt_reorder_level;
    EditText edt_stock_qty;
    Button btn_clear,btn_save;
    View mView;
    ListView list_medicine_save;
    public AddMedicineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView=inflater.inflate(R.layout.fragment_add_medicine, container, false);
        initViews();
        btn_save.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        return mView;
    }

    public void initViews(){
        edt_name = mView.findViewById(R.id.edt_name);
        edt_generic_name = mView.findViewById(R.id.edt_generic_name);
        edt_form_type = mView.findViewById(R.id.edt_form_type);
        edt_purchase_price = mView.findViewById(R.id.edt_purchase_price);
        edt_sales_price = mView.findViewById(R.id.edt_sales_price);
        edt_reorder_level = mView.findViewById(R.id.edt_reorder_level);
        edt_stock_qty = mView.findViewById(R.id.edt_stock_qty);
        btn_clear = mView.findViewById(R.id.btn_clear);
        btn_save = mView.findViewById(R.id.btn_save);
        list_medicine_save=mView.findViewById(R.id.list_medicine_save);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_save) {
            if (!TextUtils.isEmpty(edt_name.getText()) && !TextUtils.isEmpty(edt_generic_name.getText())
                    && !TextUtils.isEmpty(edt_form_type.getText()) && !TextUtils.isEmpty(edt_purchase_price.getText())
                    && !TextUtils.isEmpty(edt_sales_price.getText()) && !TextUtils.isEmpty(edt_reorder_level.getText())
                    && !TextUtils.isEmpty(edt_stock_qty.getText())) {
                String name = edt_name.getText().toString();
                String generic_name = edt_generic_name.getText().toString();
                String form_type = edt_form_type.getText().toString();
                String purchase_price = edt_purchase_price.getText().toString();
                String sales_price = edt_sales_price.getText().toString();
                String reorder_level = edt_reorder_level.getText().toString();
                String stock_qty = edt_stock_qty.getText().toString();
            }

        }else{
            edt_stock_qty.getText().clear();
            edt_reorder_level.getText().clear();
            edt_sales_price.getText().clear();
            edt_purchase_price.getText().clear();
            edt_form_type.getText().clear();
            edt_generic_name.getText().clear();
            edt_name.getText().clear();
            edt_name.requestFocus();
        }
    }
}
