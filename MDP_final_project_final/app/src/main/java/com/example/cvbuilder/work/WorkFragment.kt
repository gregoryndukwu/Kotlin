package com.example.cvbuilder.work

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cvbuilder.R
import com.example.cvbuilder.work.WorkExperienceAdapter
import com.example.cvbuilder.work.Work
import kotlinx.android.synthetic.main.fragment_work.*


class WorkFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        work_experience_recycler_view.layoutManager = LinearLayoutManager(this.requireContext())
        work_experience_recycler_view.setHasFixedSize(true)
        val workExperienceList = arrayListOf<Work>(
            Work(
                "Sr Abap Developer",
                "Abap Developer",
                "InfoWeb",
                "John Deere",
                "06/13/2022",
                "current",
                R.drawable.deere
            ),
            Work(
                "software engineer",
                "PI Consultant",
                "Rimini Street",
                "Rimini Street",
                "04/01/2020",
                "07/13/2021",
                R.drawable.rimini
            ),
            Work(
                "Fiori Developer",
                "Building Fiori App",
                "Sonda IT",
                "Sonda IT",
                "01/01/2017",
                "03/31/2020",
                R.drawable.sonda
            ),
            Work(
                "Abap Developer",
                "Create Abap Programs",
                "TCS (Tata)",
                "Birla Carbon",
                "06/01/2015",
                "01/01/2017",
                R.drawable.tcs
            )
        )
        work_experience_recycler_view.adapter = WorkExperienceAdapter(workExperienceList)

        work_fab.setOnClickListener { view ->
            val builder = AlertDialog.Builder(this.requireContext())
            val inflater = layoutInflater
            builder.setTitle("Add a new work experience")
            val dialogLayout = inflater.inflate(R.layout.work_form, null)
            builder.setView(dialogLayout)

            fun addNewWorkExperience() {
                var workTitle = dialogLayout.findViewById<EditText>(R.id.work_form_title).text.toString()
                var workDescription = dialogLayout.findViewById<EditText>(R.id.work_form_description).text.toString()
                var workCompany = dialogLayout.findViewById<EditText>(R.id.work_form_company).text.toString()
                var workClient = dialogLayout.findViewById<EditText>(R.id.work_form_client).text.toString()
                var workStartDate = dialogLayout.findViewById<EditText>(R.id.work_form_startdate).text.toString()
                var workEnddate = dialogLayout.findViewById<EditText>(R.id.work_form_enddate).text.toString()

                if(workTitle != "" && workCompany != "" && workStartDate != "" && workEnddate != "" ) {
                    val work = Work(workTitle, workDescription, workCompany, workClient, workStartDate, workEnddate, R.drawable.working)
                    workExperienceList.add(work)
                }
            }

            builder.setPositiveButton("Add") { dialogInterface, i -> addNewWorkExperience() }
            builder.setNegativeButton("Cancel") { dialogInterface, i -> Toast.makeText(this.requireContext(), "You canceled the new item", Toast.LENGTH_LONG).show() }
            builder.show()
        }
    }
}